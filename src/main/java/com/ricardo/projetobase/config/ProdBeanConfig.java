package com.ricardo.projetobase.config;

import com.ricardo.projetobase.beans.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdBeanConfig {

    @Bean
    public MyBean testeBeanPROD() {
        System.out.println("PROD profile started !");
        return new MyBean();
    }
}
