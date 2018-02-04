package com.sys.org.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Debasish on 04-Feb-18 8:06 PM
 */
@Configuration
public class AppConfig {
    @Bean
    public String getFolderPAth() {

        return "hello";
    }
}
