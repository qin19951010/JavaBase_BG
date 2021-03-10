import com.Qinnn.Config.JavaConfig;
import com.Qinnn.Interface.Food;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName main
 * @Author: Qinnn、
 * @Description: TODO
 * @Date: create in 2020/10/21 15:58
 */
public class main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().getSystemProperties().put("people","北方人");
        context.register(JavaConfig.class);
        context.refresh();
        Food food = (Food) context.getBean("food");
        System.out.println(food.showName());
    }

}
