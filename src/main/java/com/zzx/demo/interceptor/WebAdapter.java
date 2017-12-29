package com.zzx.demo.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author sinc
 * @version V1.0
 * @Description: TODO
 * @Package com.zzx.demo.interceptor
 * @date 2017/12/29 16:54
 */
@Configuration
public class WebAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //众多的拦截器组成了一个拦截器链
        /**
         * 主要方法说明：
         * addPathPatterns 用于添加拦截规则
         * excludePathPatterns 用户排除拦截
         */
        registry.addInterceptor(new CustomInterceptor()).addPathPatterns("/*");
        super.addInterceptors(registry);
    }


}
