package com.example.deliveryaddressserver10500.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.deliveryaddressserver10500.po.DeliveryAddress;
import com.example.feignapi.common.ResponseResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 11:42
 */
public interface DeliveryAddressService  extends IService<DeliveryAddress> {
    ResponseResult<List<DeliveryAddress>> getDeliveryAddresses(String uid);
    ResponseResult<DeliveryAddress> saveAddress(DeliveryAddress deliveryAddress);
    ResponseResult<DeliveryAddress> deleteAddress(Integer daId);
}
