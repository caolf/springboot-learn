package com.clf.springboot.learn.web.filter;/**
 * @Author clf
 * @Date 2018/9/19
 * @Desc
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Name: springboot-learn
 *
 * @description:
 *
 * @author: clf
 *
 * @create: 2018-09-19 20:27
 */
public class MyFilter implements Filter {

    private Logger logger= LoggerFactory.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request= (HttpServletRequest) servletRequest;
        HttpServletResponse response= (HttpServletResponse) servletResponse;

        //登陆验证
        Cookie[] cookies = request.getCookies();
        String values=new String();
        boolean flag=false;
        if(cookies!=null && cookies.length>0){
            for(Cookie item : cookies){
                if("userName".equals(item.getName()) && "张三".equals(item.getValue())){
                    flag=true;
                }
                values+=item.getName()+":"+item.getValue()+"    ;";
            }
            logger.info(values);
        }

        if(flag){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            if(request.getRequestURI().contains("/lzc_web/login")){
                filterChain.doFilter(servletRequest,servletResponse);
            }
            response.sendRedirect(request.getContextPath()+"/lzc_web/login");
            /*RequestDispatcher rd = request.getRequestDispatcher("/lzc_web/login");
            logger.info(request.getRequestURI());
            rd.forward(request,response);*/
        }



    }

    @Override
    public void destroy() {

    }
}
