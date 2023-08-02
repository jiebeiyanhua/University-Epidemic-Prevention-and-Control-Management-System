package com.zty.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("st_access")
public class Access {
    @TableId(value = "id",type = IdType.AUTO )
    private Integer id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "course")
    private String course;
    @TableField(value = "sclass")
    private String sclass;
    @TableField(value = "day")
    private String day;
    @TableField(value = "contact")
    private String contact;
    @TableField(value = "reason")
    private String reason;
    @TableField(value = "state")
    private String state;

    public Integer getid(){ return id;}
    public void setid(Integer id){this.id = id;}

    public String getname(){return name;}
    public void setname(String name){this.name=name;}

    public String getcourse(){return course;}
    public void setcourse(String course){this.course=course;}

    public String getsclass(){return sclass;}
    public void setsclass(String sclass){this.sclass=sclass;}

    public String getday(){return day;}
    public void setday(String day){this.day=day;}

    public String getcontact(){return contact;}
    public void setcontact(String contact){this.contact=contact;}

    public String getreason(){return reason;}
    public void setReason(String reason){this.reason=reason;}

    public String getState(){return state;}
    public void setState(String state){this.state=state;}
}
