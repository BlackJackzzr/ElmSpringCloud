package com.example.orderserver10600.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.orderserver10600.po.OrderDetailed;
import com.example.orderserver10600.po.OrderDetailedFoodVo;
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
public interface OrderDetailedDao extends BaseMapper<OrderDetailed> {
    @Select("select od.od_id, f.food_name, od.quantity, f.food_price from order_detailed od left outer join food f on od.food_id=f.food_id where od.order_id=#{orderId}")
    @Results(id = "orderDetailedFoodVoResultMap", value = {
            @Result(column = "od_id", property = "odId", javaType = Integer.class),
            @Result(column = "food_name", property = "foodName", javaType = String.class),
            @Result(column = "quantity", property = "quantity", javaType = Integer.class),
            @Result(column = "food_price", property = "foodPrice", javaType = Double.class)
    })
    List<OrderDetailedFoodVo> findHistoryOrderDetailed(Integer orderId);


    @Select("select * from order_detailed where order_id=#{orderId}")
    List<OrderDetailed> findOrderDetailedByOrderId(Integer orderId);
}
