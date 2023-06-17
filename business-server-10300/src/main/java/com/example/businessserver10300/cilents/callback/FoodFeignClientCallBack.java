package com.example.businessserver10300.cilents.callback;


import com.example.feignapi.clients.FoodClient;
import com.example.feignapi.common.ResponseResult;

public class FoodFeignClientCallBack implements FoodClient {
    @Override
    public ResponseResult getFoods(Integer bid) {
        return new ResponseResult(403,"fegin触发了熔断降级",null);
    }
}
