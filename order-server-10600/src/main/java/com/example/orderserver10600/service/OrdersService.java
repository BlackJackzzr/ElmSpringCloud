package com.example.orderserver10600.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.feignapi.common.ResponseResult;
import com.example.orderserver10600.po.OrderBusinessVo;
import com.example.orderserver10600.po.Orders;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 20:24
 */
public interface OrdersService extends IService<Orders> {
    ResponseResult<Orders> saveOrder(Orders order);
    ResponseResult<List<OrderBusinessVo>> getHistoryOrders(String userId);
}
