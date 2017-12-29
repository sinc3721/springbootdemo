package com.zzx.demo.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author sinc
 * @version V1.0
 * @Description: TODO
 * @Package com.zzx.demo.filter
 * @date 2017/12/29 16:17
 */
@WebFilter(filterName="testfilter", urlPatterns = "/*")
public class TestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init--------------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter--------------");
        //执行操作后必须doFilter
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("destroy--------------");
    }
}
