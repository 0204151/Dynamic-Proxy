package dongTaiDaiLi;

import java.lang.reflect.Executable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author:zh
 * @Date: 2023/8/13 12:30
 * @Description:
 */

//调用处理程序
public class MyInvocationHandler implements InvocationHandler{

    private Agency agencyClass;

    public MyInvocationHandler(Agency agency){
        agencyClass = agency;
    }

    /**
     *  invoke方法为代理对象实际执行的方法
     *  proxy：可以使用它通过反射获取有关代理的信息，或者在后续调用中使用它（当使用该代理调用另一个方法时，或作为结果。
     *
     * @param proxy  代理对象
     * @param method 要执行的方法
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //前置增强
        System.out.println("你好呀");
        if (args != null) System.out.println("你们好呀");
        Object invoke = method.invoke(agencyClass, args);
        //后置增强
        return invoke;
    }











    public static void main(String[] args) {
        AgencyClass agencyClass = new AgencyClass();
        MyInvocationHandler handler = new MyInvocationHandler(agencyClass);
        Class<Agency> agencyClass1 = Agency.class;


        //两个一样
        ClassLoader classLoader = agencyClass.getClass().getClassLoader();
        ClassLoader handlerClassLoader = handler.getClass().getClassLoader();

        Method[] methods = agencyClass.getClass().getMethods();
        Method[] methods1 = agencyClass1.getMethods();

        Agency o = (Agency) Proxy.newProxyInstance(classLoader, new Class[]{agencyClass1}, handler);

        o.sayHello().say("aa");
    }
}
