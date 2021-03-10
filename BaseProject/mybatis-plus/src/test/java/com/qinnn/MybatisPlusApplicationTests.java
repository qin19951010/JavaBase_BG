package com.qinnn;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.datatype.jsr310.DecimalUtils;
import com.qinnn.dao.UserMapper;
import com.qinnn.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.commons.lang3.RandomStringUtils;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootTest
@Slf4j
class MybatisPlusApplicationTests {

    @Resource
    private UserMapper userMapper;

    LambdaQueryWrapper<User> lambdaQueryWrapper = new QueryWrapper<User>().lambda();
    LambdaQueryWrapper<User> lambdaQueryWrapper1 = new LambdaQueryWrapper<>();
    LambdaQueryWrapper<User> lambdaQueryWrapper2 = Wrappers.lambdaQuery();

    @Test
    public void select(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void insert(){
        User user = new User();
        user.setAge(31);
        user.setManagerId(1088248166370832385L);
        user.setCreateTime(LocalDateTime.now());
        int insert = userMapper.insert(user);
        System.out.println("影像记录数："+insert);
    }

    @Test
    public void selectByWrapper(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name","雨").lt("age",40);
        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    /**
     * 创建日期为2019年2月14日并且直属上级姓名为王姓
     * date_format(create_time,'%Y-%m-%d') and manager_id in (select id from user where name like '王%')
     */
    @Test
    public void selectByWrapper2(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.apply("date_format(create_time,'%Y-%m-%d')={0}","2019-02-14")
                .inSql("manager_id","select id from user where name like '王%'");
        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    /**
     * 名字为王姓，（年龄小于40或者邮箱不为空）
     */
    @Test
    public void selectByWrapper3(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.likeRight("name","王").and(wq-> wq.lt("age",40).or().isNotNull("email"));

        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    /**
     * 名字为王姓，（年龄小于40，并且年龄大于20，并且邮箱不为空）
     */
    @Test
    public void selectWrapper4(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.likeRight("name", "王").and(wq -> wq.between("age", 20, 40).and(wqq -> wqq.isNotNull("email")));
        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    /**
     * （年龄小于40或者邮箱不为空）并且名字为王姓
     * （age<40 or email is not null）and name like '王%'
     */
    @Test
    public void selectWrapper5(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.nested(wq->wq.lt("age",40).or().isNotNull("email")).likeRight("name","王");

        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    /**
     * 年龄为30,31,35,34的员工
     */
    @Test
    public void selectWrapper6(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.in("age", Arrays.asList(30,31,34,35));

        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    /**
     * 只返回满足条件的一条语句即可
     * limit 1
     */
    @Test
    public void selectWrapper7(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();

        queryWrapper.in("age", Arrays.asList(30,31,34,35)).last("limit 1");

        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    /**
     * 查找为王姓的员工的姓名和年龄
     */
    @Test
    public void selectWrapper8(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("name","age").likeRight("name","王");
        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    /**
     * 查询所有员工信息除了创建时间和员工ID列
     */
    @Test
    public void selectWrapper9(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select(User.class,info->!info.getColumn().equals("create_time")
                &&!info.getColumn().equals("manager_id"));
        List<User> userList = userMapper.selectList(queryWrapper);
        userList.forEach(System.out::println);
    }

    @Test
    public void lambdaSelect(){
        LambdaQueryWrapper<User> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.like(User::getName,"雨").lt(User::getAge,40);

        List<User> userList = userMapper.selectList(lambdaQueryWrapper);
        userList.forEach(System.out::println);
    }

    @Test
    public void selectPage(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("age",20);

        //设置当前页和页容量
        Page<User> page = new Page<>(1, 2);

        IPage<User> userIPage = userMapper.selectPage(page, queryWrapper);

        System.out.println("总页数："+userIPage.getPages());
        System.out.println("总记录数："+userIPage.getTotal());
        userIPage.getRecords().forEach(System.out::println);
    }

    @Test
    public void updateTest2() {
        UpdateWrapper<User> wrapper = new UpdateWrapper<User>();
        wrapper.eq("name","李艺伟").eq("age",26);

        User user = new User();
        user.setEmail("updatEmail@Qinnn");
        int update = userMapper.update(user, wrapper);
    }

    @Test
    public void queryAll() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(user -> System.out.println(user));
    }

    @Test
    public void updateByLambda() {
        LambdaUpdateWrapper<User> wrapper = new LambdaUpdateWrapper<User>(new User());
        wrapper.eq(User::getName,"李艺伟").eq(User::getAge,25).set(User::getAge,22);
        int i = userMapper.update(new User(),wrapper);
    }

    @Test
    public void deleteById(){
        userMapper.deleteById(4566L);
    }

    //测试逻辑删除
    @Test
    public void selectIgnoreDeleteTest(){
        int i = userMapper.update(null, new LambdaUpdateWrapper<User>().eq(User::getId, 3456L).set(User::getId, 5555));
        System.out.println(String.valueOf(i)+ "条数据已经更新!");
    }

    @Test
    public void testLock(){
        int version = 1;
        User user = new User();
        user.setEmail("wtf@168.com");
        user.setAge(34);
        user.setId(2345L);
        user.setManagerId(1234L);
        user.setVersion(1);
        userMapper.updateById(user);
    }
}
