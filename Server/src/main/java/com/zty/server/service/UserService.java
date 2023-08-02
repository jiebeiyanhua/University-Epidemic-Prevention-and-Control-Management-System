package com.zty.server.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zty.server.dao.Userdao;
import com.zty.server.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//service:业务，功能需求，格局功能需求，调用dao中的增删改查的方法
@Service
public class UserService {
    @Autowired  //自动装配：在框架的容器中找到Userdao的实现类的对象，然后赋值给dao
    Userdao dao;

    //login的业务方法
    public User login(String name, String pwd){
        QueryWrapper<User> qw =
                new QueryWrapper<>();
        qw.eq("username",name)
                .eq("password",pwd);
        List<User> users = dao.selectList(qw);
        if(users.size() >0){
            return users.get(0);
        }
        return null;
    }
    public Boolean adduser(User user){
        int row = dao.insert(user);
        return row > 0 ? true:false;
    }
}
