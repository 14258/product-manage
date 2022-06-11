package com.example.productmanage.config;

import com.example.productmanage.interceptor.CorsInterceptor;
import com.example.productmanage.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig  implements WebMvcConfigurer {


    @Bean
    LoginInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }


    @Bean
    CorsInterceptor corsInterceptor(){
        return new CorsInterceptor();
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //拦截全部
        registry.addInterceptor(corsInterceptor()).addPathPatterns("/**");

        registry.addInterceptor(loginInterceptor()).addPathPatterns("/api/pri/product/*/**");

        WebMvcConfigurer.super.addInterceptors(registry);
    }


}


