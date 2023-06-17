package com.example.orderserver10600.service.impl;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 20:24
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.feignapi.common.ResponseResult;
import com.example.orderserver10600.mapper.OrdersDao;
import com.example.orderserver10600.po.OrderBusinessVo;
import com.example.orderserver10600.po.Orders;
import com.example.orderserver10600.service.OrdersService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName OrdersServiceImpl
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 20:24
 *@Version 1.0
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersDao, Orders> implements OrdersService {

    @Resource
    OrdersDao orderDao;

    @Override
    public ResponseResult<Orders> saveOrder(Orders order) {
        orderDao.insert(order);
        return new ResponseResult<Orders>(200,"请求成功",null);
    }

    @Override
    public ResponseResult<List<OrderBusinessVo>> getHistoryOrders(String userId) {
        List<OrderBusinessVo> list = orderDao.getHistoryOrders(userId);
        if (list == null) {
            return new ResponseResult<List<OrderBusinessVo>>(500, "网络错误", null);
        }
        return new ResponseResult<List<OrderBusinessVo>>(200, "请求成功", list);
    }
}
