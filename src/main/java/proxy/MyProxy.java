package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
* @author WH 作者 E-mail: 
* @version 创建时间：2017年3月24日 下午3:32:10 
* 类说明 
*/
public class MyProxy implements InvocationHandler {
    
    private UserService target;
    
    public  MyProxy(UserService bird) {
        this.target=bird;
    }

    
    /**
     * 创建代理实例
     * @return
     * @throws Throwable
     */
    public Object getProxy() throws Throwable {
        return Proxy.newProxyInstance(Thread.currentThread()
                .getContextClassLoader(), this.target.getClass()
                .getInterfaces(), this);
    }
    
    
    /***
     * 第一个目标对象,
     * 第二个是方法名称
     * 第三个参数
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        //System.out.println(proxy);
        // TODO Auto-generated method stub
        String methodName=method.getName();
        System.out.println(methodName);
        
        //System.out.println("执行方法之前的日志"+args[0]);
        method.invoke(target , args);
       return null ;
        
    }

}
 