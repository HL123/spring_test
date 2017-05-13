package cn.bjut.ai.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by huanglei on 17/5/12.
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunService funService(){
        return new FunService();
    }

    @Bean
    public UseFunService useFunService(){
        UseFunService useFunService = new UseFunService();
        useFunService.setFunService(funService());
        return useFunService;
    }

//    @Bean
//    public UseFunService useFunService(FunService funService){
//        UseFunService useFunService = new UseFunService();
//        useFunService.setFunService(funService);
//        return useFunService;
//    }

}
