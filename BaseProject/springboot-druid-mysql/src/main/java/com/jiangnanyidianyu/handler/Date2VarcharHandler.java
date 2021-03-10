package com.jiangnanyidianyu.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @ClassName Date2VarcharHandler
 * @Author: Qinnn、
 * @Description: TODO  Date转Varchar
 * @Date: create in 2020/10/23 17:46
 */

/**
 *
 *  自定义类型转换处理器
 *  1.实现TypeHandler
 *  2.继承BaseTypeHandler<T>类
 *
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(Date.class)
public class Date2VarcharHandler implements TypeHandler<Date> {

    @Override
    public void setParameter(PreparedStatement ps, int i, Date parameter, JdbcType jdbcType) throws SQLException {
        //System.out.println(String.valueOf(parameter.getTime()));
        ps.setString(i, String.valueOf(parameter.getTime()));
    }

    @Override
    public Date getResult(ResultSet rs, String columnName) throws SQLException {
        return new Date(rs.getLong(columnName));
    }

    @Override
    public Date getResult(ResultSet rs, int columnIndex) throws SQLException {
        return new Date(rs.getLong(columnIndex));
    }

    @Override
    public Date getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return cs.getDate(columnIndex);
    }
}
