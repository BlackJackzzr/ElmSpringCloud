package com.example.deliveryaddressserver10500.controller;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 11:46
 */

import com.example.deliveryaddressserver10500.po.DeliveryAddress;
import com.example.deliveryaddressserver10500.service.DeliveryAddressService;
import com.example.feignapi.common.ResponseResult;
import jakarta.annotation.Resource;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@ClassName DeliveryAddressController
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 11:46
 *@Version 1.0
 */
@RestController
@RequestMapping("/deliveryaddress")
@RefreshScope
@CrossOrigin
public class DeliveryAddressController {
    @Resource
    DeliveryAddressService deliveryAddressService;

    @GetMapping("/getDeliveryAddresses/{uid}")
    public ResponseResult<List<DeliveryAddress>> getDeliveryAddresses(@PathVariable String uid)  {
        return deliveryAddressService.getDeliveryAddresses(uid);
    }

    @PostMapping
    public ResponseResult<DeliveryAddress> saveDeliveryAddress(@RequestBody DeliveryAddress deliveryAddress) {
        return deliveryAddressService.saveAddress(deliveryAddress);
    }

    @DeleteMapping("/{daId}")
    public ResponseResult<DeliveryAddress> deleteDeliveryAddress(@PathVariable Integer daId){
        return deliveryAddressService.deleteAddress(daId);
    }
}
