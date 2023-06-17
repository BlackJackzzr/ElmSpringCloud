package com.example.businessserver10300.service.impl;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-13
 * Time: 16:53
 */

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.businessserver10300.mapper.BusinessDao;
import com.example.businessserver10300.po.Business;
import com.example.businessserver10300.service.BusinessService;
import com.example.feignapi.common.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@ClassName BusinessServiceImpl
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/13 16:53
 *@Version 1.0
 */
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessDao, Business> implements BusinessService {
    @Autowired
    private BusinessDao businessDao;


    @Override
    public boolean saveBusiness(Business business) {
        return businessDao.insert(business) > 0;
    }

    @Override
    public boolean modify(Business business) {
        return businessDao.updateById(business) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return businessDao.deleteById(id) > 0;
    }

    @Override
    public IPage<Business> getPage(int currentPage, int pageSize) {
        IPage<Business> page = new Page<>(currentPage, pageSize);
        businessDao.selectPage(page, null);
        return page;
    }

    @Override
    public ResponseResult<List<Business>> selectByOrderType(int orderType) {
        QueryWrapper<Business> qw = new QueryWrapper<>();
        qw.eq("order_type_id", orderType);
        List<Business> list = businessDao.selectList(qw);
        if(list == null){
            return new ResponseResult<List<Business>>(500, "网络错误", null);
        }
        return new ResponseResult<List<Business>>(200, "请求成功", list);
    }

    @Override
    public ResponseResult<List<Business>> getBusinesses() {
        List<Business> list = businessDao.selectList(null);
        if (list == null) {
            return new ResponseResult<List<Business>>(500, "网络错误", null);
        }
        return new ResponseResult<List<Business>>(200, "请求成功", list);
    }

    @Override
    public ResponseResult<Business> getBusinessById(Integer id) {
        Business business = businessDao.selectById(id);
        if (business == null) {
            return new ResponseResult<Business>(500, "网络错误", null);

        }
        return new ResponseResult<Business>(200, "请求成功", business);
    }
}
