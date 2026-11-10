package com.rhs.controller;

import com.rhs.entity.Result;
import com.rhs.entity.User;
import com.rhs.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * OpenAPI 3 的注解（@Tag），但 Knife4j 3.x 使用的是 Swagger 2，需要使用 @Api 注解
 */
@RestController
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    @ApiOperation("获取所有用户")
    public Result getAll() {
        List<User> userList = userService.list();
        return Result.sucess(userList);
    }
}
