package com.zty.server.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zty.server.dao.Healthdao;
import com.zty.server.entity.Health;
import com.zty.server.entity.Student;
import com.zty.server.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthService {
    @Autowired
    Healthdao dao;
    //增删改查
    public Boolean addHealth(Health health){
        int row = dao.insert(health);
        return row > 0 ? true:false;
    }
    public Boolean deleteHealth(Integer id){
        int row = dao.deleteById(id);
        return row > 0 ? true:false;
    }
    public Boolean updateHealth(Health health){
        int row = dao.updateById(health);
        return row > 0 ? true:false;
    }
    public List<Health> findAllHealth(){
        return dao.selectList(null);
    }
}
