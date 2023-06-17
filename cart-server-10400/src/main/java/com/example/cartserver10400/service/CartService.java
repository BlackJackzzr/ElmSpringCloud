package com.example.cartserver10400.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.cartserver10400.po.Cart;
import com.example.feignapi.common.ResponseResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 11:04
 */
public interface CartService extends IService<Cart> {

    ResponseResult<List<Cart>> getCarts(String userId, Integer businessId);
    ResponseResult saveCart(Cart[] carts);
    ResponseResult deleteCart(Integer cid);
}
