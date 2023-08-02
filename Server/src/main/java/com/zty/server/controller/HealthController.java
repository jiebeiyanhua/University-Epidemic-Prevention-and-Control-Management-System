package com.zty.server.controller;

import com.zty.server.entity.Health;
import com.zty.server.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class HealthController {
    @Autowired
    HealthService service;

    //查询
    @GetMapping("healthlist")
    public Map<String,Object> queryAll(){
        List<Health> data = service.findAllHealth();
        Map<String, Object> map = new HashMap<>();
        map.put("data",data);
        map.put("code",0);
        map.put("msg","");
        map.put("count",data.size());
        return map;
    }
    //添加
    @GetMapping("addhealth")
    public Map<String,Boolean> addhealth(Health health){
        Boolean aBoolean = service.addHealth(health);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //更新
    @GetMapping("updatahealth")
    public Map<String,Boolean> updata(Health health){
        Boolean aBoolean = service.updateHealth(health);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //删除
    @GetMapping("deletehealth")
    public Map<String,Boolean> deleteHealth(Integer id){
        Boolean aBoolean = service.deleteHealth(id);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
}
