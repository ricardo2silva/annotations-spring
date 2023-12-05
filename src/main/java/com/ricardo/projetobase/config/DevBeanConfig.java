package com.ricardo.projetobase.config;

import com.ricardo.projetobase.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevBeanConfig {

    @Bean
    public MyBean testeBeanDEV() {
        System.out.println("DEV profile started !");
        return new MyBean();
    }
}
