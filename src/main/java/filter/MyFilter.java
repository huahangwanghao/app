package filter; 
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import aop.service.TestService;
/** 
* @author WH 作者 E-mail: 
* @version 创建时间：2017年3月30日 上午10:18:08 
* 类说明 
*/
public class MyFilter implements Filter {

    @Resource
    private TestService testService;
    
    
    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("this is init function");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
      System.out.println("this is the before");
      String test=testService.getTest();
      System.out.println("----------------------->"+test);
      chain.doFilter(request, response);
      System.out.println("this is the after");
    }
    @Override
    public void destroy() {
       System.out.println("this is init function");
    }
}
 