package com.example.orderserver10600.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.orderserver10600.po.OrderBusinessVo;
import com.example.orderserver10600.po.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 12:09
 */
@Mapper
public interface OrdersDao extends BaseMapper<Orders> {
    @Select("SELECT o.order_id, b.business_name, o.order_total, o.order_state, b.delivery_price FROM orders o LEFT OUTER JOIN business b ON o.business_id = b.business_id where o.user_id = #{userId}")
    @Results(id = "orderBusinessVoResultMap", value = {
            @Result(column = "order_id", property = "orderId", javaType = Integer.class),
            @Result(column = "business_name", property = "businessName", javaType = String.class),
            @Result(column = "order_total", property = "orderTotal", javaType = Double.class),
            @Result(column = "order_state", property = "orderState", javaType = Integer.class),
            @Result(column = "delivery_price", property = "deliveryPrice", javaType = Double.class)
    })
    List<OrderBusinessVo> getHistoryOrders(String userId);
}
