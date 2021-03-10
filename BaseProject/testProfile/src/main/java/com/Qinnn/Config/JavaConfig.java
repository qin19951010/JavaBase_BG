package com.Qinnn.Config;

import com.Qinnn.Condition.NoodlesCondition;
import com.Qinnn.Condition.RiceCondition;
import com.Qinnn.Interface.Food;
import com.Qinnn.Noodles;
import com.Qinnn.Rice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @ClassName JavaConfig
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/21 15:49
 */
@Configuration
public class JavaConfig {
    @Bean("food")
    @Profile("南方人")
//    @Conditional(RiceCondition.class)
    Food rice()
    {
        return new Rice();
    }

    @Bean("food")
    @Profile("北方人")
//    @Conditional(NoodlesCondition.class)
    Food noodles()
    {
        return new Noodles();
    }

}
