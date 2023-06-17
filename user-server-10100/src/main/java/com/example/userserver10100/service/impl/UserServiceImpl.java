package com.example.userserver10100.service.impl;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-11
 * Time: 15:43
 */

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.feignapi.common.ResponseResult;
import com.example.userserver10100.mapper.UserDao;
import com.example.userserver10100.po.User;
import com.example.userserver10100.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *@ClassName UserServiceImpl
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/11 15:43
 *@Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public boolean saveUser(User user) {
        return userDao.insert(user) > 0;
    }

    @Override
    public boolean modify(User user) {
        return userDao.updateById(user) > 0;
    }

    @Override
    public boolean delete(String id) {
        return userDao.deleteById(id) > 0;
    }

    @Override
    public IPage<User> getPage(int currentPage, int pageSize) {
        IPage<User> page = new Page<>(currentPage, pageSize);
        userDao.selectPage(page, null);
        return page;
    }

    @Override
    public User getUserByUserName(String userName) {
        LambdaQueryWrapper<User> qw = new LambdaQueryWrapper<>();
        qw.eq(User::getUserName, userName);
        return userDao.selectOne(qw);
    }

    @Override
    public ResponseResult<User> login(User user){
        User storedUser = userDao.getUserById(user.getUserId());
        if (storedUser == null) {
            throw new RuntimeException("用户不存在");
        }
        if (!storedUser.getPassword().equals(user.getPassword())) {
            throw new RuntimeException("密码错误");
        }
        storedUser.setPassword("");
        // 添加其他需要返回的用户信息
        return new ResponseResult<>(200,"登录成功", storedUser);
    }
    @Override
    public ResponseResult<User> register(User user){
        User u = userDao.getUserById(user.getUserId());
        if (u!=null){
            return new ResponseResult<>(500, "用户名已存在", null);
        }
        userDao.insert(user);
        user.setPassword("");
        return new ResponseResult<>(200, "注册成功", user);
    }

}
