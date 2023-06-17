package com.example.foodserver10200.controller;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-12
 * Time: 21:27
 */

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.foodserver10200.common.ResponseResult;
import com.example.foodserver10200.po.Food;
import com.example.foodserver10200.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@ClassName FoodController
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/12 21:27
 *@Version 1.0
 */
@RestController
@RequestMapping("/foods")
@CrossOrigin
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/selectByBusinessId/{businessId}")
    public ResponseResult<List<Food>> selectByBusinessId(@PathVariable Integer businessId){
        return foodService.selectByBusinessId(businessId);
    }
}
