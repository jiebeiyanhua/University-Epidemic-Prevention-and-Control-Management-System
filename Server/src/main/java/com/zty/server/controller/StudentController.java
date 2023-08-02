package com.zty.server.controller;

import com.zty.server.entity.Student;
import com.zty.server.entity.User;
import com.zty.server.service.StudentService;
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
public class StudentController {
    @Autowired
    StudentService service;

    //查询
    @GetMapping("studentlist")
    public Map<String,Object> queryAll(){
        List<Student> data = service.findAllStudent();
        Map<String, Object> map = new HashMap<>();
        map.put("data",data);
        map.put("code",0);
        map.put("msg","");
        map.put("count",data.size());
        return map;
    }
    //添加
    @GetMapping("addstudent")
    public Map<String,Boolean> addstudent(Student stu){
        Boolean aBoolean = service.addStudent(stu);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //更新
    @GetMapping("updatastudent")
    public Map<String,Boolean> updata(Student stu){
        Boolean aBoolean = service.updateStudent(stu);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //删除
    @GetMapping("deletestudent")
    public Map<String,Boolean> deleteStudent(Integer id){
        Boolean aBoolean = service.deleteStudent(id);
        Map<String,Boolean> map = new HashMap<>();
        map.put("msg",aBoolean);
        return map;
    }
    //查询到该老师的学生
    @GetMapping("student_t")    //http://localhost:8080/
    public Map<String, Object> findsStudent(String teacher) {
        Map<String, Object> map = new HashMap<>();
        map.put("data",service.finds_Student(teacher));
        map.put("code",0);
        map.put("msg","");
        map.put("count",service.finds_Student(teacher).size());
        return map;
    }

    @GetMapping("student_uid")    //http://localhost:8080/
    public Map<String, Object> findsuid(String uid) {
        Map<String, Object> map = new HashMap<>();
        map.put("data",service.finds_uid(uid));
        map.put("code",0);
        map.put("msg","");
        map.put("count",service.finds_uid(uid).size());
        return map;
    }
}
