package com.zty.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("student")
public class Student {
    @TableId(value = "id",type = IdType.AUTO )
    private Integer id;
    @TableField(value = "uid")
    private String uid;
    @TableField(value = "name")
    private String name;
    @TableField(value = "course")
    private String course;
    @TableField(value = "sclass")
    private String sclass;
    @TableField(value = "teacher")
    private String teacher;
    @TableField(value = "dormitory")
    private String dormitory;
    @TableField(value = "contact")
    private String contact;
    @TableField(value = "task")
    private String task;


    public Integer getid(){ return id;}
    public void setid(Integer id){this.id = id;}

    public String getuid(){ return uid;}
    public void setuid(String uid){this.uid = uid;}

    public String getname(){return name;}
    public void setname(String name){this.name=name;}

    public String getcourse(){return course;}
    public void setcourse(String course){this.course=course;}

    public String getsclass(){return sclass;}
    public void setsclass(String sclass){this.sclass=sclass;}

    public String getteacher(){return teacher;}
    public void setteacher(String teacher){this.teacher=teacher;}

    public String getdormitory(){return dormitory;}
    public void setdormitory(String dormitory){this.dormitory=dormitory;}

    public String getcontact(){return contact;}
    public void setcontact(String contact){this.contact=contact;}

    public String gettask(){return task;}
    public void settask(String task){this.task=task;}

}
