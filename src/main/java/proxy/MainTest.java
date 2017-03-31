package proxy;

import java.lang.reflect.Proxy;

/** 
* @author WH 作者 E-mail: 
* @version 创建时间：2017年3月25日 下午4:06:26 
* 类说明 
*/
public class MainTest {

    public static void main(String[] args) {
       //this is target object
        UserService userService=new UserServiceImpl();
        //创建代理
        MyProxy myProxy=new MyProxy(userService);
        //这是一个代理对象
        UserService u=(UserService) myProxy.getProxyObject();
        System.out.println(u.getClass().getName());
        u.print();
        

    }

}
 