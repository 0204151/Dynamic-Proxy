package dongTaiDaiLi;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author:zh
 * @Date: 2023/8/13 12:26
 * @Description:
 */

//被代理类，动作执行的主体
public class AgencyClass implements Agency{

    public Agency sayHello(){
        System.out.println("你好，动态代理");
        return this;
    }

    public void say(String s){
        System.out.println("你好呀" + s);
    }
}
