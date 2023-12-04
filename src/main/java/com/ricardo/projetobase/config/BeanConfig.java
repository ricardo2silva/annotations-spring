package com.ricardo.projetobase.config;

import com.ricardo.projetobase.beans.MyBean;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    // criando nosso proṕrio bean
    @Bean
    public MyBean testeBean() {
        return new MyBean();
    }

    // utilizando bean de terceiros
    @Bean
    public ModelMapper modelMapper () {
        return new ModelMapper();
    }

}
