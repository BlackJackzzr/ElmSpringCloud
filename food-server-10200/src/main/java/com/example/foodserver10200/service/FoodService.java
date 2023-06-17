package com.example.foodserver10200.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.foodserver10200.common.ResponseResult;
import com.example.foodserver10200.po.Food;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-12
 * Time: 21:25
 */
public interface FoodService extends IService<Food> {
    boolean saveFood(Food food);
    boolean modify(Food food);
    boolean delete(Integer id);
    IPage<Food> getPage(int currentPage, int pageSize);
    ResponseResult<List<Food>> selectByBusinessId(int businessId);
}
