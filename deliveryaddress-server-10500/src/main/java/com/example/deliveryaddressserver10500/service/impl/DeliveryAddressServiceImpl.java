package com.example.deliveryaddressserver10500.service.impl;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 11:43
 */

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.deliveryaddressserver10500.mapper.DeliveryAddressDao;
import com.example.deliveryaddressserver10500.po.DeliveryAddress;
import com.example.deliveryaddressserver10500.service.DeliveryAddressService;
import com.example.feignapi.common.ResponseResult;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName DeliveryAddressServiceImpl
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 11:43
 *@Version 1.0
 */
@Service
public class DeliveryAddressServiceImpl extends ServiceImpl<DeliveryAddressDao, DeliveryAddress> implements DeliveryAddressService {
    @Resource
    DeliveryAddressDao deliveryAddressDao;

    @Override
    public ResponseResult<List<DeliveryAddress>> getDeliveryAddresses(String uid) {
        List<DeliveryAddress> list = deliveryAddressDao.findDeliveryAddressesByUserId(uid);
        if (list == null) {
            return new ResponseResult<List<DeliveryAddress>>(500, "网络错误", null);
        }
        return new ResponseResult<List<DeliveryAddress>>(200, "请求成功", list);
    }

    @Override
    public ResponseResult<DeliveryAddress> saveAddress(DeliveryAddress deliveryAddress) {
        int count = deliveryAddressDao.insert(deliveryAddress);
        if (count <= 0) {
            return new ResponseResult<DeliveryAddress>(500, "网络错误", null);
        }
        return new ResponseResult<DeliveryAddress>(200, "请求成功", null);
    }

    @Override
    public ResponseResult<DeliveryAddress> deleteAddress(Integer daId) {
        deliveryAddressDao.deleteDeliveryAddressByDaId(daId);
        return new ResponseResult<DeliveryAddress>(200, "请求成功", null);

    }
}
