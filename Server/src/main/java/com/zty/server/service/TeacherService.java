package com.zty.server.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zty.server.dao.Teacherdao;
import com.zty.server.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    Teacherdao dao;
    //增删改查
    public Boolean addTeacher(Teacher teacher){
        int row = dao.insert(teacher);
        return row > 0 ? true:false;
    }
    public Boolean deletetTeacher(Integer id){
        int row = dao.deleteById(id);
        return row > 0 ? true:false;
    }
    public Boolean updatetTeacher(Teacher teacher){
        int row = dao.updateById(teacher);
        return row > 0 ? true:false;
    }
    public List<Teacher> findAllTeacher(){
        return dao.selectList(null);
    }

    public List<Teacher> findt_uid(String uid){
        QueryWrapper<Teacher> qw =
                new QueryWrapper<>();
        qw.eq("uid",uid);
        return dao.selectList(qw);
    }
}
