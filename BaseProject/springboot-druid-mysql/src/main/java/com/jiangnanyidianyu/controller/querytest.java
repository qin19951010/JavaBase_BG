package com.jiangnanyidianyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ClassName querytest
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/9/29 13:59
 */
@RestController
public class querytest {

    @Autowired
    JdbcTemplate template;

    @GetMapping("/query")
    public List<Map<String, Object>> testQuery()
    {
        List<Map<String, Object>> query = template.queryForList("select * from user");
        return query;
    }

}
