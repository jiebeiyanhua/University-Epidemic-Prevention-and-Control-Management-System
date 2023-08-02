package com.zty.server.controller;

import com.zty.server.entity.User;
import com.zty.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// controller: 控制转发，根据用户的请求，调用对应的方法，完成业务操作，给用户响应结果
@RestController
@CrossOrigin
public class UserController {
    @Autowired  //自动装配
            UserService service;

    @GetMapping("login")    //http://localhost:8080/login?username=xx&password=xx
    public Map<String, Object> login(String username, String password) {
        User user = service.login(username, password);
        Map<String, Object> map = new HashMap<>();
        if (user == null) {   //失败
            map.put("msg", false);
        } else {  //成功
            map.put("msg", true);
            map.put("user", user);
        }
        return map;
    }

    @GetMapping("register")
    public Map<String, Boolean> adduser(User user) {
        Boolean aBoolean = service.adduser(user);
        Map<String, Boolean> map = new HashMap<>();
        map.put("msg", aBoolean);
        return map;
    }
}


