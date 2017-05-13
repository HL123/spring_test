package cn.bjut.ai.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by huanglei on 17/5/12.
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunService useFunService = context.getBean(UseFunService.class);
        System.out.println(useFunService.sayHello("java config"));
        context.close();

    }
}
