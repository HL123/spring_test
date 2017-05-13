package cn.bjut.edu.di;

import org.springframework.stereotype.Component;

/**
 * Created by huanglei on 17/5/12.
 */
//@Service


@Component
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + " !";
    }
}
