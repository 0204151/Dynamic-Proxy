package dongTaiDaiLi;

import java.lang.reflect.Proxy;
import java.net.URISyntaxException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author:zh
 * @Date: 2023/8/31 10:45
 * @Description:
 */


/**
 * 1.调用Proxy的静态方法，生成代理类的字节码（class文件）
 * 2.然后通过代理类的构造函数类对象生成代理对象，并存入调用处理程序
 * 3.代理对象继承Proxy类并实现被代理对象的接口，创建时通过父类构造器传递调用处理程序
 * 4.调用函数时实际是调用父类的InvocationHandler的属性值的invoke函数，并传入代理对象，函数对象，参数集合（Object【】）
 * 5.invoke函数通过被代理对象激活函数对象，并实现前后增强
 */
public class Test {
    public static void main(String[] args) {
        AgencyClass agencyClass = new AgencyClass();

        Agency o = (Agency) Proxy.newProxyInstance(agencyClass.getClass().getClassLoader(), agencyClass.getClass().getInterfaces(), new MyInvocationHandler(agencyClass));

        o.say("aaaa");
        // 保存JDK动态代理生成的代理类，类名保存为 UserServiceProxy
        try {
            ProxyUtils.generateClassFile(agencyClass.getClass(), "AgencyProxy");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
