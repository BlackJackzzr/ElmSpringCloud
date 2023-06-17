package com.example.cartserver10400.service.impl;
/*
  Created with IntelliJ IDEA.
  Description:
  User: 周门
  Date: 2023-06-14
  Time: 11:05
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.cartserver10400.mapper.CartDao;
import com.example.cartserver10400.po.Cart;
import com.example.cartserver10400.service.CartService;
import com.example.feignapi.common.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName CartServiceImpl
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 11:05
 *@Version 1.0
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartDao, Cart> implements CartService {
    @Autowired
    private CartDao cartDao;

    @Override
    public ResponseResult<List<Cart>> getCarts(String userId, Integer businessId) {
        List<Cart> list = cartDao.getCartsByUserIdAndBusinessId(userId, businessId);
        if (list == null) {
            return new ResponseResult<>(500, "网络错误", null);
        }
        return new ResponseResult<>(200, "请求成功", list);
    }

    @Override
    public ResponseResult saveCart(Cart[] carts) {
        Cart temp = null;
        for (Cart cart : carts) {
            if (cart.getQuantity() == 0) {
                cartDao.deleteCartByUserIdAndBusinessIdAndFoodId(cart.getUserId(), cart.getBusinessId(), cart.getFoodId());
            } else {
                temp = cartDao.getCartByUserIdAndBusinessIdAndFoodId(cart.getUserId(), cart.getBusinessId(), cart.getFoodId());
                if (temp == null) {
                    cartDao.insert(cart);
                } else {
                    cart.setCartId(temp.getCartId());
                    cartDao.insert(cart);
                }
            }
        }
        return new ResponseResult(200, "更新成功", null);
    }

    @Override
    public ResponseResult deleteCart(Integer id) {
        cartDao.deleteById(id);
        return new ResponseResult(200, "删除成功", null);
    }
}
