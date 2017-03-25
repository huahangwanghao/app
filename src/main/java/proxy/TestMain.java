package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Proxy;
import org.springframework.web.method.support.InvocableHandlerMethod;

/** 
* @author WH 作者 E-mail: 
* @version 创建时间：2017年3月24日 下午3:01:59 
* 类说明 
*/
public class TestMain {

    public static void main(String[] args) throws Throwable {
        //创建一个目标对象
        UserService userService=new UserServiceImpl();
        //创建一个代理
        MyProxy myProxy=new MyProxy(userService);
        //通过代理得到目标代理对象
        UserService proxy=(UserService) myProxy.getProxy();
        
        //System.out.println(proxy);
        
        //代理对象执行目标方法
        proxy.stopFly("123");
        
     
        System.out.println("it's out");

    }

}
 