package com.jiangnanyidianyu.dao;

import com.jiangnanyidianyu.bean.Author;
import com.jiangnanyidianyu.bean.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao {

    Book getBookById(Integer id);

    Book getBookById2(Integer id);

    Author getAuthorById(Integer id);

}
