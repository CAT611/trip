package com.gec.filter;
import java.io.IOException;  

import javax.servlet.Filter;  
import javax.servlet.FilterChain;  
import javax.servlet.FilterConfig;  
import javax.servlet.ServletException;  
import javax.servlet.ServletRequest;  
import javax.servlet.ServletResponse;  
  
public class EncodeFilter implements Filter{  
    //定义替换后的字符集，从过滤器的配置参数中读取  
    String newCharSet="utf-8";  
    public void destroy(){  
    }  
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException   
    {  
        //处理请求字符集  
        request.setCharacterEncoding(newCharSet);  
          
        //传递给下一个过滤器。这里没有下一个，作为过滤器的规则和良好的编程习惯，应该加上  
        chain.doFilter(request,response);  
  
        //处理响应字符集  
        response.setContentType("text/html;charset="+newCharSet);  
    }  
      
    public void init(FilterConfig filterConfig)throws ServletException   
    {  
        //从过滤器的配置中获得初始化参数，如果没有就使用默认值  
        if(filterConfig.getInitParameter("newcharset")!=null)  
        {  
            newCharSet = filterConfig.getInitParameter("newcharset");  
        }  
        else  
            newCharSet = "GB2312";  
    }  
}  