package com.zty.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("teacher") // 这里实体类对应的数据库的表的名字
public class Teacher {
    @TableId(value = "id",type = IdType.AUTO )
    private Integer id;
    @TableField(value = "uid")
    private String uid;
    @TableField(value = "name")
    private String name;
    @TableField(value = "age")
    private String age;
    @TableField(value = "profession")
    private String profession;
    @TableField(value = "study")
    private String study;
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

    public String getage(){return age;}
    public void setage(String age){this.age=age;}

    public String getprofession(){return profession;}
    public void setprofession(String profession){this.profession=profession;}

    public String getstudy(){return study;}
    public void setstudy(String study){this.study=study;}

    public String getcontact(){return contact;}
    public void setcontact(String contact){this.contact=contact;}

    public String gettask(){return task;}
    public void settask(String task){this.task=task;}

}
