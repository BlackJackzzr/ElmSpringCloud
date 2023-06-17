package com.example.orderserver10600.service.impl;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 20:25
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.feignapi.common.ResponseResult;
import com.example.orderserver10600.mapper.OrderDetailedDao;
import com.example.orderserver10600.po.OrderDetailed;
import com.example.orderserver10600.po.OrderDetailedFoodVo;
import com.example.orderserver10600.service.OrderDetailedService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName OrderDetailedServiceImpl
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 20:25
 *@Version 1.0
 */
@Service
public class OrderDetailedServiceImpl extends ServiceImpl<OrderDetailedDao, OrderDetailed> implements OrderDetailedService {
    @Resource
    OrderDetailedDao orderDetailedDao;

    public ResponseResult<List<OrderDetailed>> getOrderDetailed(Integer id) {
        List<OrderDetailed> list = orderDetailedDao.findOrderDetailedByOrderId(id);
        if (list == null) {
            return new ResponseResult<List<OrderDetailed>>(500, "网络错误", null);
        }
        return new ResponseResult<List<OrderDetailed>>(200, "请求成功", list);

    }


    public ResponseResult<List<OrderDetailed>> updateOrderDetailed(OrderDetailed[] orderDetailed) {
        int count = 0;
        for (OrderDetailed i : orderDetailed) {
            count += orderDetailedDao.insert(i);
        }
        if (count == orderDetailed.length) {
            return new ResponseResult<List<OrderDetailed>>(200, "添加成功", null);
        }
        return new ResponseResult<List<OrderDetailed>>(500, "添加失败", null);
    }

    public ResponseResult<List<OrderDetailedFoodVo>> getHistoryOrderDetailed(Integer id) {
        List<OrderDetailedFoodVo> list = orderDetailedDao.findHistoryOrderDetailed(id);
        if (list == null) {
            return new ResponseResult<List<OrderDetailedFoodVo>>(500, "网络错误", null);
        }
        return new ResponseResult<List<OrderDetailedFoodVo>>(200, "请求成功", list);
    }

}
