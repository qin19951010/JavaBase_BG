package com.Qinnn.Condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName RiceCondition
 * @Author: Qinnn、
 * @Description: TODO Rice 和 Noodles 的条件类
 * @Date: create in 2020/10/21 15:43
 */
public class RiceCondition implements Condition {

    /**
     * 当系统中 people 属性值为 '南方人' 的时候，RiceCondition 的条 件得到满足，
     * 换句话说，哪个条件得到满足，一会就会创建哪个 Bean 。
     */

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        return conditionContext.getEnvironment().getProperty("people").equals("南方人");
    }
}
