package com.zty.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author Administrator
 */
@TableName("user") // 这里实体类对应的数据库的表的名字
public class User{
    @TableId(value = "id",type = IdType.AUTO )
    private Integer id;
    @TableField(value = "uid")
    private String uid;
    @TableField(value = "username")
    private String username;
    @TableField(value = "password")
    private String password;

    public Integer getid(){ return id;}
    public void setid(Integer id){this.id = id;}

    public String getuid(){ return uid;}
    public void setuid(String uid){this.uid = uid;}

    public String getusername(){return username;}
    public void setusername(String username){this.username=username;}

    public String getpassword(){return password;}
    public void setpassword(String password){this.password=password;}

}