package com.zzx.demo.config;

/**
 * @author sinc
 * @version V1.0
 * @Description: TODO
 * @Package com.zzx.demo.config
 * @date 2017/12/29 17:15
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "custom")
@Data
public class CustomPropertis {
    private String name ;

}
