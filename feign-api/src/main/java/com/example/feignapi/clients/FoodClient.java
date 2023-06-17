package com.example.feignapi.clients;


import com.example.feignapi.clients.fallback.FoodClientFallbackFactory;
import com.example.feignapi.common.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "food-server",fallbackFactory = FoodClientFallbackFactory.class)
public interface FoodClient {
    @GetMapping("/food/getFoods/{id}")
    ResponseResult getFoods(@PathVariable Integer id);
}
