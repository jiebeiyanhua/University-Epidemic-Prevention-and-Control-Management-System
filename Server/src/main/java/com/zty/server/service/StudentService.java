package com.zty.server.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zty.server.dao.Studentdao;
import com.zty.server.entity.Student;
import com.zty.server.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    Studentdao dao;
//增删改查
    public Boolean addStudent(Student stu){
        int row = dao.insert(stu);
        return row > 0 ? true:false;
    }
    public Boolean deleteStudent(Integer id){
        int row = dao.deleteById(id);
        return row > 0 ? true:false;
    }
    public Boolean updateStudent(Student stu){
        int row = dao.updateById(stu);
        return row > 0 ? true:false;
    }
    public List<Student> findAllStudent(){
        return dao.selectList(null);
    }
    public List<Student> finds_Student(String teacher){
        QueryWrapper<Student> qw =
                new QueryWrapper<>();
        qw.eq("teacher",teacher);
        return dao.selectList(qw);
    }

    public List<Student> finds_uid(String uid){
        QueryWrapper<Student> qw =
                new QueryWrapper<>();
        qw.eq("uid",uid);
        return dao.selectList(qw);
    }
}
