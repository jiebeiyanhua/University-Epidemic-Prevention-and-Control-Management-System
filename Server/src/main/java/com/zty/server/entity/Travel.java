package com.zty.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("st_travel")
public class Travel {
    @TableId(value = "id",type = IdType.AUTO )
    private Integer id;
    @TableField(value = "name")
    private String name;
    @TableField(value = "course")
    private String course;
    @TableField(value = "sclass")
    private String sclass;
    @TableField(value = "paddress")
    private String paddress;
    @TableField(value = "gaddress")
    private String gaddress;
    @TableField(value = "transport")
    private String transport;
    @TableField(value = "contact")
    private String contact;
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

    public String getPaddress(){return paddress;}
    public void setPaddress(String paddress){this.paddress=paddress;}

    public String getGaddress(){return gaddress;}
    public void setGaddress(String gaddress){this.gaddress=gaddress;}

    public String gettransport(){return transport;}
    public void settransport(String transport){this.transport=transport;}

    public String getcontact(){return contact;}
    public void setcontact(String contact){this.contact=contact;}

    public String getState(){return state;}
    public void setState(String state){this.state=state;}

}
