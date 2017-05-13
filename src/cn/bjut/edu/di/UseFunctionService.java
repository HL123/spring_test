package cn.bjut.edu.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huanglei on 17/5/12.
 */
@Service("aaaa")
public class UseFunctionService {
    @Autowired
    FunctionService functionService1;
    public String sayHello(String word){
        return functionService1.sayHello(word);
    }
}
