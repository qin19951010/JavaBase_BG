package com.Qinnn.Condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


/**
 * @ClassName NoodlesCondition
 * @Author: Qinnn、
 * @Description: TODO  Noodles 的条件类
 * @Date: create in 2020/10/21 15:42
 */
public class NoodlesCondition implements Condition {

    /**
     *  在 matches 方法中做条件属性判断，当系统属性中的 people 属性值为 '北方人' 的时候，
     *  NoodlesCondition 的条件得到满足
     */

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return conditionContext.getEnvironment().getProperty("people").equals("北方人");
    }

}
