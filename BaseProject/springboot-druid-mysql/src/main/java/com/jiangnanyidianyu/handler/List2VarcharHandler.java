package com.jiangnanyidianyu.handler;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName List2VarcharHandler
 * @Author: Qinnn、
 * @Description: TODO   为了将List数据存入Varchar中,自定义类型转换器
 * @Date: create in 2020/10/23 10:26
 */
//注解指定要处理的Jdbc类型
@MappedJdbcTypes(JdbcType.VARCHAR)
//注解指定要处理的java类型
@MappedTypes(List.class)
public class List2VarcharHandler implements TypeHandler<List<String>> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, List<String> strings, JdbcType jdbcType) throws SQLException {
        String join = StringUtils.join(strings, ",");

        preparedStatement.setString(i,join);
    }

    @Override
    public List<String> getResult(ResultSet resultSet, String s) throws SQLException {
        String favs = resultSet.getString(s);
        if(favs != null)
        {
            return Arrays.asList(favs.split(","));
        }
        return null;
    }

    @Override
    public List<String> getResult(ResultSet resultSet, int i) throws SQLException {
        String favs = resultSet.getString(i);
        if(favs != null)
        {
            return Arrays.asList(favs.split(","));
        }
        return null;
    }

    @Override
    public List<String> getResult(CallableStatement callableStatement, int i) throws SQLException {
        String favs = callableStatement.getString(i);
        if(favs != null)
        {
            return Arrays.asList(favs.split(","));
        }
        return null;
    }
}
