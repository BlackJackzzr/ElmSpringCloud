package com.example.foodserver10200.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.foodserver10200.po.Food;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-12
 * Time: 21:23
 */
@Mapper
public interface FoodDao extends BaseMapper<Food> {
}
