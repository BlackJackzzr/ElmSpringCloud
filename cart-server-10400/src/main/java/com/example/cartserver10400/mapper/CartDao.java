package com.example.cartserver10400.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cartserver10400.po.Cart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 11:03
 */
@Mapper
public interface CartDao extends BaseMapper<Cart> {
    @Select("select * from cart where user_id=#{userId} and business_id=#{businessId}")
    List<Cart> getCartsByUserIdAndBusinessId(String userId, Integer businessId);
    @Select("select * from cart where user_id=#{userId} and business_id=#{businessId} and food_id=#{foodId}")
    Cart getCartByUserIdAndBusinessIdAndFoodId(String userId, Integer businessId, Integer foodId);
    @Delete("delete from cart where user_id=#{userId} and business_id=#{businessId} and food_id=#{foodId}")
    void deleteCartByUserIdAndBusinessIdAndFoodId(String userId, Integer businessId, Integer foodId);
}
