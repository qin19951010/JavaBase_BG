package com.jiangnanyidianyu.dao;

import com.jiangnanyidianyu.bean.user;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserDao
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/9/29 14:54
 */
@Repository
public interface UserDao {

//    user getUserById(String id);
//
//    user getUserById2(String id);
//
//    user getUserById3(@Param("userid") String userid);
//
//    int deleteById(String id);
//
//    int InsertUsersbyUUID(user user);
//
//    int updateById(user user);
//
//    @Select("SELECT * FROM user WHERE userid = #{userid}")
//    List<user> get(String age);
//
//    @Insert("INSERT INTO user(userid, username,pwd,mark) VALUES (#{userid}, #{username},#{pwd},#{mark})") //3
//    void insert(user user);
//
//    int addUser(user user);
//
//    List<user> FuzzyQueryAllUserById1(String id);
//
//    List<user> FuzzyQueryAllUserById2(String id);
//
//    user QueryUserById_HandlerType(String id);
//
//    int insertUser_HandlerType(user user);
//
//    List<user> getUserByPage(@Param("start") Integer start, @Param("count") Integer count);
//
//    List<user> getUserByUsernameAndId(@Param("userid") String userid, @Param("username") String username);
//
////    List<user> getUserByIds(@Param("ids")String[] ids);
//    List<user> getUserByIds(@Param("ids") List<String> ids);
//
//    Integer batchInsertUser(@Param("users") List<user> users);
//
//    List<user> getUserByIds2(@Param("ids") List<String> ids);
//
//    Integer updateUser(user user);
}
