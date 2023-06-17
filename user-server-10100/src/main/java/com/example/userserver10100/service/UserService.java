package com.example.userserver10100.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.feignapi.common.ResponseResult;
import com.example.userserver10100.po.User;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-11
 * Time: 15:41
 */
public interface UserService extends IService<User> {
    boolean saveUser(User user);
    boolean modify(User user);
    boolean delete(String id);
    IPage<User> getPage(int currentPage, int pageSize);
    //    UserDTO login(User user);
    User getUserByUserName(String userName);

    public ResponseResult<User> login(User user);
    public ResponseResult<User> register(User user);
}
