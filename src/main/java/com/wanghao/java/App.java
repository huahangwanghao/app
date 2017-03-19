package com.wanghao.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");
        //testReflect();
        System.out.println(isMobileNO("123"));
    }
    
    /**
     * 测试反射的问题
     */
    private static void testReflect(){
        try {
            Document document=DocumentHelper.parseText("");
            Element root=document.getRootElement();
            
            
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
    
    private static boolean isMobileNO(String mobiles){
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
        Matcher m = p.matcher(mobiles);
       return m.matches();
   }
}
