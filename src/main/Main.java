package main; /**
 * Created by huanglei on 17/5/12.
 */
import cn.bjut.edu.config.DIconfig;
import cn.bjut.edu.di.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIconfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("di"));
        System.out.println(useFunctionService);
        System.out.println(useFunctionService.toString());
        context.close();
    }
}
