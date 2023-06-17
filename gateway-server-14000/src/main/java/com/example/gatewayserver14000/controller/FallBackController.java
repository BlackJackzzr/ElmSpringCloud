package com.example.gatewayserver14000.controller;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-15
 * Time: 10:11
 */

import com.example.feignapi.common.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName FallBackController
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/15 10:11
 *@Version 1.0
 */
@RestController
public class FallBackController {
    @RequestMapping("/fallback")
    public ResponseResult fallback() {
        return new ResponseResult(403,"Gateway触发了熔断降级",null);
    }
}
