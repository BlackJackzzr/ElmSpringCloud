package com.example.userserver10100.controller;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-11
 * Time: 15:45
 */
import com.example.feignapi.common.ResponseResult;
import com.example.userserver10100.po.User;
import com.example.userserver10100.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *@ClassName UserController
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/11 15:45
 *@Version 1.0
 */
@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
//    @Operation(summary = "用户登陆")
    public ResponseResult<User> login(@RequestBody User user){
        return userService.login(user);
    }

    @PostMapping("/register")
//    @Operation(summary = "用户注册")
    public ResponseResult<User> register(@RequestBody User user){
        return userService.register(user);
    }
}
