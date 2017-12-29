package com.zzx.demo.config;

import com.zzx.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sinc
 * @version V1.0
 * @Description: TODO
 * @Package com.zzx.demo.config
 * @date 2017/12/29 16:02
 */

@Configuration
@EnableConfigurationProperties(value = CustomPropertis.class)
public class UtilConfig {
    @Autowired
    private CustomPropertis customPropertis;



    @Bean
    @ConditionalOnMissingBean(Account.class)
    public Account getAccount(){

        return new Account().setAccountId(11111);
    }

}
