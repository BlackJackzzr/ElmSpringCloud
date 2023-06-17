package com.example.feignapi.clients.fallback;

import com.example.feignapi.clients.FoodClient;
import com.example.feignapi.common.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;


@Slf4j
public class FoodClientFallbackFactory implements FallbackFactory<FoodClient> {

    @Override
    public FoodClient create(Throwable cause) {
        return new FoodClient() {
            @Override
            public ResponseResult getFoods(Integer bid) {
                log.error("查询商家食品异常", cause);
                return new ResponseResult(403, "查询商家食品异常", null);
            }
        };
    }
}

