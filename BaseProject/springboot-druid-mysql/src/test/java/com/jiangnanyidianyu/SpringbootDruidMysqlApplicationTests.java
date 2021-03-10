package com.jiangnanyidianyu;

import com.jiangnanyidianyu.bean.Author;
import com.jiangnanyidianyu.bean.Book;
import com.jiangnanyidianyu.bean.md;
import com.jiangnanyidianyu.bean.user;
import com.jiangnanyidianyu.dao.*;
import com.jiangnanyidianyu.mbg.mapper.PatVisitMapper;
import com.jiangnanyidianyu.model.Personnel;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Slf4j
@SpringBootTest
class SpringbootDruidMysqlApplicationTests {

//    @Autowired
//    PatVisitMapper patVisitMapper;

    @Autowired
    DataSource dataSource;

    @Autowired
    UserDao userDao;

    @Autowired
    RoleDao RoleDao;

    @Autowired
    BookDao bookDao;

    @Autowired
    MdDao mdDao;

    @Autowired
    AuthorDao authorDao;

    /**
     *
     * JsonInclude.Include.ALWAYS 这个是默认策略，任何情况下都序列化该字段，和不写这个注解是一样的效果。
     *
     * [***] JsonInclude.Include.NON_NULL 这个最常用，即如果加该注解的字段为null，那么就不序列化这个字段了。
     *
     * JsonInclude.Include.NON_ABSENT 这个包含NON_NULL，即为null的时候不序列化，详情看源码。
     *
     * JsonInclude.Include.NON_EMPTY 这个属性包含NON_NULL，NON_ABSENT之后还包含如果字段为空也不序列化。
     *
     * JsonInclude.Include.NON_DEFAULT 这个属性是如果该字段为默认值的话就不序列化。
     *
     * JsonInclude.Include.USE_DEFAULTS 使用默认值的情况下就不序列化。
     *
     * JsonInclude.Include.CUSTOM 这个是自定义包含规则
     *
     */

    @Test
    void contextLoads() /*throws SQLException*/ {

//        Connection connection = dataSource.getConnection();
//
//        log.info("connection==============" + connection);

//        ArrayList<user> list = new ArrayList<>();
//        int sum = 0;
//        for (int i = 0; i < 50; i++) {
//            user user = new user();
//            user.setUsername("Qinnn" + RandomStringUtils.randomNumeric(5));
//            user.setPwd(RandomStringUtils.randomNumeric(5));
//            user.setMark("测试数据" + RandomStringUtils.randomNumeric(5));
//
//            sum += userDao.InsertUsersbyUUID(user);
//
//            list.add(user);
//        }

        /** 使用jackson转换list */
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setSerializationInclusion(JsonInclude.Include.CUSTOM);
//        try {
//            String userJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
//            System.out.println("插入" + sum + "条数据完成！" + userJsonString);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }

//        int i = userDao.deleteById("70e0e3e1-1433-11eb-97f3-00ff3fd90965");
//        System.out.println("userid为" + "70e0e3e1-1433-11eb-97f3-00ff3fd90965的记录已被删除！");

//        user user = new user();
//        user.setMark("这是一条被修改的数据");
//        user.setUsername("Qzl_QAQ");
//        user.setPwd("156456dsad");
//        user.setUserid("3b013f3e-1435-11eb-97f3-00ff3fd90965");
//        int i = userDao.updateById(user);
//
//        System.out.println("userid为" + user.getUserid() + "的记录已被更新！");

//        user user = userDao.getUserById("3b013f3e-1435-11eb-97f3-00ff3fd90965");
//        System.out.println(user);

        /** 使用自定义类型转换器插入数据, List<String> 插入到数据库中的 Varchar */
//        user user = new user();
//
//        user.setUserid(RandomStringUtils.randomNumeric(5));
//        user.setPwd("312321dsad");
//        user.setMark("测试自定义类型转换器");
//        user.setUsername("Qinnnntest002");
//        user.setRegTime(new Date());
//
//        List<String> list = Arrays.asList("读书", "看报", "冥想");
//        user.setFavorites(list);
//
//        int i = userDao.addUser(user);
//        System.out.println(user.toString());

        /** 测试mapper文件中$和#的区别 */
        /** # */
//        user user = userDao.getUserById("09900");
//        System.out.println(user.toString());

        /** $ */
//        user user2 = userDao.getUserById2("09900");
//        System.out.println(user2.toString());

        /** 测试两种模糊查询 1.concat函数+#{} 2.占位符直接拼接${}  */

//        List<user> list = userDao.FuzzyQueryAllUserById2("9900");
//        System.out.println(list);

        /** 测试ResultMap */
//        user user = userDao.getUserById3("12727");
//
//        System.out.println(user.toString());

        /** 测试TypeHandler处理器 java中date插入转为varchar,查询显示date */
//        user user = new user();
//
//        user.setRegTime(new Date());
//        user.setUserid("19950819");
//        user.setUsername("Qinnn");
//        user.setPwd("dasdasd4a5sda");
//        List<String> list = Arrays.asList("吃饭", "睡觉", "打豆豆");
//        user.setFavorites(list);
//        user.setMark("测试TypeHandler处理器 java中date插入转为varchar,查询显示date");
//
//        int i = userDao.insertUser_HandlerType(user);

//        user user1 = userDao.QueryUserById_HandlerType("19950819");
//        System.out.println(user1);

        /** 分页测试 */
//        List<user> userByPage1 = userDao.getUserByPage(null, null);
//        System.out.println("userByPage1"  + userByPage1);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.setSerializationInclusion(JsonInclude.Include.CUSTOM);
//
//        List<user> userByPage2 = userDao.getUserByPage(2, 2);
//        System.out.println("userByPage2"  + userByPage2);
//
//        try {
//            String userJsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(userByPage1);
//
//            String userJsonString2 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(userByPage2);
//            /** 导出到txt */
//            jsonAbout.outFileByString("userJsonString",userJsonString);
//            jsonAbout.outFileByString("userJsonStrin2",userJsonString2);
//
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        /** where和if关键字测试 */
//        List<user> user1 = userDao.getUserByUsernameAndId(null, null);
//        System.out.println("user1:" + user1);
//
//        List<user> user2 = userDao.getUserByUsernameAndId(null, "QAQ");
//        System.out.println("user2:" + user2);
//
//        List<user> user3 = userDao.getUserByUsernameAndId("1995", null);
//        System.out.println("user3:" + user3);
//
//        List<user> user4 = userDao.getUserByUsernameAndId("1995", "QAQ");
//        System.out.println("user4:" + user4);

        /** foreach测试 */
//        String[] ids = {"09900","09901","09902","09904"};
//        List<user> users = userDao.getUserByIds(Arrays.asList(ids));
//        System.out.println(users);

//        user user1 = new user();
//        user1.setUserid("19950819_1");
//        user1.setUsername("QINNNNNN_1");
//        user1.setPwd("dsada111111");
//        user1.setRegTime(new Date());
//
//        user user2 = new user();
//        user2.setUserid("19950819_2");
//        user2.setUsername("QINNNNNN_2");
//        user2.setPwd("dsada111111");
//        user2.setRegTime(new Date());
//
//        user user3 = new user();
//        user3.setUserid("19950819_3");
//        user3.setUsername("QINNNNNN_3");
//        user3.setPwd("dsada111111");
//        user3.setRegTime(new Date());
//
//        user user4 = new user();
//        user4.setUserid("19950819_4");
//        user4.setUsername("QINNNNNN_4");
//        user4.setPwd("dsada111111");
//        user4.setRegTime(new Date());
//
//        List<user> users = new ArrayList<>();
//
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);
//        users.add(user4);
//
//        Integer integer = userDao.batchInsertUser(users);

        /** SQL片段 */
//        List<String> asList = Arrays.asList("09900", "09901","09902","19950819");
//        List<user> userList = userDao.getUserByIds2(asList);
//        System.out.println(userList);

        /** set关键字 (一般用在更新中) */
//        user user = new user();
//        user.setUserid("19950819");
//        user.setUsername("Qinnn19950819");
//        user.setFavorites(Arrays.asList("读书","学习","看报"));
//        user.setRegTime(new Date());
//        int i = userDao.updateUser(user);

        /** 一对一查询 */
//        Book book = bookDao.getBookById(8001);
//        System.out.println(book);

        /** 懒加载 */
//        Book book = bookDao.getBookById2(8001);
//        System.out.println(book);
//        Author author = bookDao.getAuthorById(1001);
//        System.out.println(author);


    }

    @Test
    void mdTest(){
//        md md = mdDao.selectMdByid(1);
//        //System.out.println(md);
//
//        md.setId(111);
//
//        int i = mdDao.insertMd(md);
//        System.out.println("插入成功!" + i);

//        md md = mdDao.selectMdByid(1);
//        System.out.println(md);
//        Personnel personnel = RoleDao.getPersonnelById(3);
//
//        Personnel personnel2 = RoleDao.getPersonnelById(3);
//
//        System.out.println(personnel);
    }

    @Test
    void test()
    {
        Author authorWithBooks = authorDao.queryAuthorWithBooks("1001");
        System.out.println(authorWithBooks);
    }

    @Test
    void test2()
    {
        Book book = bookDao.getBookById(888);
        System.out.println(book);
    }

    @Test
    void test3()
    {
        Author author = new Author();
        author.setAge(100);
        author.setName("Qzl_QAQ");
        author.setBooks(null);
        ArrayList<String> Lhobbys = new ArrayList<>();
        Lhobbys.add("读书");
        Lhobbys.add("看报");
        Lhobbys.add("看电影");
        author.setHobbys(Lhobbys);
        int num;
        for (int i = 1; i < 201; i++) {
            author.setId(i);
            num = authorDao.insertAuthor(author);
        }
    }

}
