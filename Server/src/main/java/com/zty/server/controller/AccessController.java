package com.zty.server.controller;

import com.zty.server.entity.Access;
import com.zty.server.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class AccessController {
    @Autowired
    AccessService service;

    //查询
    @GetMapping("accesslist")
    public Map<String,Object> queryAll(){
        List<Access> data = service.findAllAccess();
        Map<String, Object> map = new HashMap<>();
        map.put("data",data);
        map.put("code",0);
        map.put("msg","");
        map.put("count",data.size());
        return map;
    }
    //添加
    @GetMapping("addaccess")
    public Map<String,Boolean> addaccess(Access access){
        Boolean aBoolean = service.addAccess(access);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //更新
    @GetMapping("updataaccess")
    public Map<String,Boolean> updata(Access access){
        Boolean aBoolean = service.updateAccess(access);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //删除
    @GetMapping("deleteaccess")
    public Map<String,Boolean> deleteAccess(Integer id){
        Boolean aBoolean = service.deleteAccess(id);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
}
