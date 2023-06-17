package com.example.foodserver10200.service.impl;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-12
 * Time: 21:26
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.foodserver10200.common.ResponseResult;
import com.example.foodserver10200.mapper.FoodDao;
import com.example.foodserver10200.po.Food;
import com.example.foodserver10200.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName FoodServiceImpl
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/12 21:26
 *@Version 1.0
 */
@Service
public class FoodServiceImpl extends ServiceImpl<FoodDao, Food> implements FoodService {
    @Autowired
    private FoodDao foodDao;

    @Override
    public boolean saveFood(Food food) {
        return foodDao.insert(food) > 0;
    }

    @Override
    public boolean modify(Food food) {
        return foodDao.updateById(food) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return foodDao.deleteById(id) > 0;
    }

    @Override
    public IPage<Food> getPage(int currentPage, int pageSize) {
        IPage<Food> page = new Page<>(currentPage, pageSize);
        foodDao.selectPage(page, null);
        return page;
    }

    @Override
    public ResponseResult<List<Food>> selectByBusinessId(int businessId) {
        QueryWrapper<Food> qw = new QueryWrapper<>();
        qw.eq("business_id", businessId);
        List<Food> list = foodDao.selectList(qw);
        if (list == null) {
            return new ResponseResult<List<Food>>(500, "网络错误", null);
        }
        return new ResponseResult<List<Food>>(200, "请求成功", list);
    }
}
