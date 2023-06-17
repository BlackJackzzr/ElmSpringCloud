package com.example.orderserver10600.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.feignapi.common.ResponseResult;
import com.example.orderserver10600.mapper.OrderDetailedDao;
import com.example.orderserver10600.po.OrderDetailed;
import com.example.orderserver10600.po.OrderDetailedFoodVo;
import jakarta.annotation.Resource;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 20:24
 */
public interface OrderDetailedService extends IService<OrderDetailed> {

    ResponseResult<List<OrderDetailed>> updateOrderDetailed(OrderDetailed[] orderDetailed);
    ResponseResult<List<OrderDetailedFoodVo>> getHistoryOrderDetailed(Integer id);
    ResponseResult<List<OrderDetailed>> getOrderDetailed(Integer id);
}
