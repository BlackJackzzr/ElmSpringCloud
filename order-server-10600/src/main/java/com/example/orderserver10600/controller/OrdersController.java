package com.example.orderserver10600.controller;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-15
 * Time: 9:49
 */

import com.example.feignapi.common.ResponseResult;
import com.example.orderserver10600.po.OrderBusinessVo;
import com.example.orderserver10600.po.Orders;
import com.example.orderserver10600.service.OrdersService;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@ClassName OrdersController
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/15 9:49
 *@Version 1.0
 */
@RestController
@RequestMapping("/order")
@RefreshScope
@CrossOrigin
public class OrdersController {
    @Resource
    OrdersService orderService;


    @GetMapping("/getHistoryOrders/{uid}")
    public ResponseResult<List<OrderBusinessVo>> getHistoryOrders(@PathVariable String uid){
        return orderService.getHistoryOrders(uid);
    }

    @PostMapping("/updateOrder")
    public ResponseResult<Orders> updateOrder(@RequestBody Orders order){
        return orderService.saveOrder(order);
    }
}
