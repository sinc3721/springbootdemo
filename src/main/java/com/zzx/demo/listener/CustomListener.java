package com.zzx.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author sinc
 * @version V1.0
 * @Description: TODO
 * @Package com.zzx.demo.listener
 * @date 2017/12/29 17:08
 */
@WebListener
public class CustomListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("servletContext初始化......");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servletContext销毁......");
    }
}
