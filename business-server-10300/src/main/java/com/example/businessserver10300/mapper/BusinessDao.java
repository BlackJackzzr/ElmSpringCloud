package com.example.businessserver10300.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.businessserver10300.po.Business;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-13
 * Time: 16:52
 */
@Mapper
public interface BusinessDao extends BaseMapper<Business> {
}
