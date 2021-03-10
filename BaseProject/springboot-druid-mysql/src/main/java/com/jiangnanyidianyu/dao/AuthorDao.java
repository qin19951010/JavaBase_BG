package com.jiangnanyidianyu.dao;

import com.jiangnanyidianyu.bean.Author;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @ClassName AuthorDao
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2021/1/18 14:54
 */
@Repository
public interface AuthorDao {

    Author queryAuthorWithBooks(@Param(value = "aid") String id);

    int insertAuthor(Author author);
}
