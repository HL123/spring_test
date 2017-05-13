package cn.bjut.ai.javaconfig;

/**
 * Created by huanglei on 17/5/12.
 */
public class UseFunService {

    FunService funService;

    public void setFunService(FunService funService){
        this.funService = funService;
    }

    public String sayHello(String word){
        return funService.sayHello(word);
    }

}
