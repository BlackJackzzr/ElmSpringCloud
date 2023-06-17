package com.example.businessserver10300.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.businessserver10300.po.Business;
import com.example.feignapi.common.ResponseResult;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-13
 * Time: 16:53
 */
public interface BusinessService extends IService<Business> {
    boolean saveBusiness(Business business);
    boolean modify(Business business);
    boolean delete(Integer id);
    IPage<Business> getPage(int currentPage, int pageSize);
    ResponseResult<List<Business>> selectByOrderType(int orderType);
    public ResponseResult<List<Business>> getBusinesses();
    public ResponseResult<Business> getBusinessById(Integer id);
}
