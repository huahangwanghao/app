package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
* @author WH 作者 E-mail: 
* @version 创建时间：2017年3月25日 下午4:07:06 
* 类说明 
*/
public class MyProxy implements InvocationHandler {

    private Object target;
    
    public  MyProxy(Object target) {
        this.target=target;
    }
    
    
    public Object getProxyObject(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    
    
    
    
    
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }

}
 