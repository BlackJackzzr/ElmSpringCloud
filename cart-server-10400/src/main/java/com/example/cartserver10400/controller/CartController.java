package com.example.cartserver10400.controller;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 11:20
 */

import com.example.cartserver10400.po.Cart;
import com.example.cartserver10400.service.CartService;
import com.example.feignapi.common.ResponseResult;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@ClassName CartController
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 11:20
 *@Version 1.0
 */
@RestController
@RequestMapping("/cart")
@RefreshScope
public class CartController {
    @Resource
    CartService cartService;

    @GetMapping("getCarts/{uid}/{bid}")
    public ResponseResult<List<Cart>> getCarts(@PathVariable String uid, @PathVariable Integer bid) {
        return cartService.getCarts(uid, bid);

    }

    @PostMapping("/saveCart")
    public ResponseResult saveCart(@RequestBody Cart[] carts) {
        return cartService.saveCart(carts);
    }
}
