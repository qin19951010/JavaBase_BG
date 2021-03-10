package com.qinnn.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @ClassName User
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2021/1/21 11:05
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User extends Model<User> {
    //逐渐策略

        @TableId(type = IdType.AUTO)//主键自动增长
    //@TableId(type = IdType.ID_WORKER)//mp自带策略，生成19位的ID值，数字类型使用这种策略，比如long
//    @TableId(type = IdType.ID_WORKER_STR)//mp自带策略，生成19位的ID值，字符串类型使用这种策略，比如string
//    @TableId(type = IdType.INPUT)//ID值不会帮我们生成，需要自己手动输入ID
//    @TableId(type = IdType.NONE)//不用任何策略，也是需要自己手动输入ID
//    @TableId(type = IdType.UUID)//每次帮我们生成一个随机的唯一的ID值
    private Long id;
    //某些字段可以进行模糊查询
    @TableField(condition = SqlCondition.LIKE)
    private String name;
    private Integer age;
    private String email;
    private Long managerId;
    @TableField(fill=FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill=FieldFill.UPDATE)
    private LocalDateTime updateTime;
    @Version
    private Integer version;
    //逻辑删除字段注解
    @TableLogic
    @TableField(select = false)
    private Integer deleted;
}
