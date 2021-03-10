package com.qinnn.config;

import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @ClassName MetaObjectHandler
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2021/1/22 13:38
 */
@Component
public class MetaObjectHandler implements com.baomidou.mybatisplus.core.handlers.MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        if(metaObject.hasSetter("creatTime"))
        {
            setInsertFieldValByName("creatTime", LocalDateTime.now(),metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if(metaObject.hasSetter("updateTime"))
        {
            Object updateTime = getFieldValByName("updateTime", metaObject);
            if(Objects.nonNull(updateTime)) {
                setUpdateFieldValByName("updateTime", LocalDateTime.now(), metaObject);
            }else
            {
                setUpdateFieldValByName("updateTime",LocalDateTime.now(),metaObject);
            }
        }
    }
}
