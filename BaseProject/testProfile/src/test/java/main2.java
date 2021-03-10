import com.Qinnn.Config.JavaConfig;
import com.Qinnn.Interface.Food;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName main2
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/21 16:31
 */
public class main2 {


    /** @Profile 更方便,但是@Conditional 更加灵活 */
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("南方人");
        context.register(JavaConfig.class);
        context.refresh();
        Food food = (Food)context.getBean("food");
        System.out.println(food.showName());
    }
}
