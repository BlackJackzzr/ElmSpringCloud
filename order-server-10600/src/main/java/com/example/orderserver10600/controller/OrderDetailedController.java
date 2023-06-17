package com.example.orderserver10600.controller;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-15
 * Time: 9:55
 */

import com.example.feignapi.common.ResponseResult;
import com.example.orderserver10600.po.OrderDetailed;
import com.example.orderserver10600.po.OrderDetailedFoodVo;
import com.example.orderserver10600.service.OrderDetailedService;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@ClassName OrderDetailedController
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/15 9:55
 *@Version 1.0
 */
@RestController
@RequestMapping("/orderDetailed")
@RefreshScope
@CrossOrigin
public class OrderDetailedController {
    @Resource
    OrderDetailedService orderDetailedService;

    @GetMapping("/getHistoryOrderDetailed/{oid}")
    public ResponseResult<List<OrderDetailedFoodVo>> getHistoryOrderDetailed(@PathVariable Integer oid){
        return orderDetailedService.getHistoryOrderDetailed(oid);
    }

    @PostMapping("/updateOrderDetailed")
    public ResponseResult<List<OrderDetailed>> updateOrderDetailed(@RequestBody OrderDetailed[] orderDetailed){
        return orderDetailedService.updateOrderDetailed(orderDetailed);
    }
}
