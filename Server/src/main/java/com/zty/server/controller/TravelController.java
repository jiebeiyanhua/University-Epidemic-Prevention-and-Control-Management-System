package com.zty.server.controller;

import com.zty.server.entity.Travel;
import com.zty.server.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class TravelController {
    @Autowired
    TravelService service;

    //查询
    @GetMapping("travellist")
    public Map<String,Object> queryAll(){
        List<Travel> data = service.findAllTravel();
        Map<String, Object> map = new HashMap<>();
        map.put("data",data);
        map.put("code",0);
        map.put("msg","");
        map.put("count",data.size());
        return map;
    }
    //添加
    @GetMapping("addtravel")
    public Map<String,Boolean> addtravel(Travel travel){
        Boolean aBoolean = service.addTravel(travel);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //更新
    @GetMapping("updatatravel")
    public Map<String,Boolean> updata(Travel travel){
        Boolean aBoolean = service.updateTravel(travel);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //删除
    @GetMapping("deletetravel")
    public Map<String,Boolean> deleteTravel(Integer id){
        Boolean aBoolean = service.deleteTravel(id);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
}
