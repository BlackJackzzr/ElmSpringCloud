package com.example.deliveryaddressserver10500.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.deliveryaddressserver10500.po.DeliveryAddress;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 11:36
 */
@Mapper
public interface DeliveryAddressDao extends BaseMapper<DeliveryAddress> {
    @Select("select * from delivery_address where user_id=#{id}")
    List<DeliveryAddress> findDeliveryAddressesByUserId(String id);
    @Delete("delete from delivery_address where da_id=#{id}")
    Integer deleteDeliveryAddressByDaId(Integer id);
}
