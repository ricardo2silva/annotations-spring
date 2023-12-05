package com.ricardo.projetobase.config;

import com.ricardo.projetobase.beans.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:custom.properties")
public class CustomPropertiesConfig {

    @Autowired
    private Environment env;


    @Bean
    public CustomProperties method(){
        String customProperties = env.getProperty("message");
        return new CustomProperties(customProperties);
    }
}
