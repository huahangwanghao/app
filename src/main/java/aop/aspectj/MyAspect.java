package aop.aspectj;

import org.aspectj.lang.JoinPoint;

import java.util.Enumeration;


/** 
* @author WH 作者 E-mail: 
* @version 创建时间：2017年3月2日 下午4:03:55 
* 类说明 
*/
public class MyAspect {
    
    public void afterMethod(JoinPoint joinPoint,Object retValue) {
        String targetName = joinPoint.getTarget().getClass().getName();  
        String methodName = joinPoint.getSignature().getName();  
       System.out.println("---------类名"+targetName);
       System.out.println("---------方法名"+methodName);
       System.out.println("return is "+retValue);
    }  
    
    public void beforeMethod(JoinPoint joinPoint) throws Exception{
        

        
    }
}
 