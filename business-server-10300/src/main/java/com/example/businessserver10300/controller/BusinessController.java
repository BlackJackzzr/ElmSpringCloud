package com.example.businessserver10300.controller;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-13
 * Time: 16:55
 */

import com.example.businessserver10300.po.Business;
import com.example.businessserver10300.service.BusinessService;
import com.example.feignapi.clients.FoodClient;
import com.example.feignapi.common.ResponseResult;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@ClassName BusinessController
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/13 16:55
 *@Version 1.0
 */
@RestController
@RequestMapping("/businesses")
@CrossOrigin
public class BusinessController {
    @Autowired
    private BusinessService businessService;
    @Resource
    FoodClient foodClient;

    @GetMapping("/listBusinessByOrderTypeId/{orderTypeId}")
    public ResponseResult<List<Business>> listBusinessByOrderTypeId(@PathVariable Integer orderTypeId){
        return businessService.selectByOrderType(orderTypeId);
    }

    @GetMapping("/getBusinesses")
    public ResponseResult<List<Business>> getAll(){
        return businessService.getBusinesses();
    }

    @GetMapping("/getBusinessInfo/{id}")
    public ResponseResult<Business> getBusinessInfo(@PathVariable Integer id) {
        return businessService.getBusinessById(id);
    }

    @GetMapping("/getFoods/{id}")
    public ResponseResult getFoods(@PathVariable Integer id) {
        ResponseResult res = foodClient.getFoods(id);
        if (res.getCode() == 200) {
            return res;
        }
        return new ResponseResult(500, "请求失败", null);
    }

}
