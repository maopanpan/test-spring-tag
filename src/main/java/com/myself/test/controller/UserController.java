package com.myself.test.controller;

import com.myself.test.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称：UserController<br>
 * 类描述：<br>
 * 创建时间：2019年01月03日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private User user;

    @GetMapping(value = "/sayHello")
    public String sayHello() {
        return "Helloworld";
    }
}
