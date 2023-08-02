package com.zty.server.controller;

import com.zty.server.entity.Student;
import com.zty.server.entity.Teacher;
import com.zty.server.service.TeacherService;
import com.zty.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// controller: 控制转发，根据用户的请求，调用对应的方法，完成业务操作，给用户响应结果
@RestController
@CrossOrigin
public class TeacherController {
    @Autowired  //自动装配
            TeacherService service;
    //查询
    @GetMapping("teacherlist")
    public Map<String,Object> queryAll(){
        List<Teacher> data = service.findAllTeacher();
        Map<String, Object> map = new HashMap<>();
        map.put("data",data);
        map.put("code",0);
        map.put("msg","");
        map.put("count",data.size());
        return map;
    }
    //添加
    @GetMapping("addteacher")
    public Map<String,Boolean> addstudent(Teacher teacher){
        Boolean aBoolean = service.addTeacher(teacher);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //更新
    @GetMapping("updatateacher")
    public Map<String,Boolean> updata(Teacher teacher){
        Boolean aBoolean = service.updatetTeacher(teacher);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //删除
    @GetMapping("deleteteacher")
    public Map<String,Boolean> deleteTeacher(Integer id){
        Boolean aBoolean = service.deletetTeacher(id);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }

    @GetMapping("teacher_uid")    //http://localhost:8080/
    public Map<String, Object> findtuid(String uid) {
        Map<String, Object> map = new HashMap<>();
        map.put("data",service.findt_uid(uid));
        map.put("code",0);
        map.put("msg","");
        map.put("count",service.findt_uid(uid).size());
        return map;
    }
}
