package com.example.feignapi.config;

import com.example.feignapi.clients.fallback.FoodClientFallbackFactory;
import org.springframework.context.annotation.Bean;


public class DefaultFeignConfiguration {
    @Bean
    public FoodClientFallbackFactory foodClientFallbackFactory() {
        return new FoodClientFallbackFactory();
    }
}
