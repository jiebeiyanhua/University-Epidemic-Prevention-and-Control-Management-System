package com.zty.server.service;

import com.zty.server.dao.Accessdao;
import com.zty.server.entity.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessService {
    @Autowired
    Accessdao dao;
    //增删改查
    public Boolean addAccess(Access access){
        int row = dao.insert(access);
        return row > 0 ? true:false;
    }
    public Boolean deleteAccess(Integer id){
        int row = dao.deleteById(id);
        return row > 0 ? true:false;
    }
    public Boolean updateAccess(Access access){
        int row = dao.updateById(access);
        return row > 0 ? true:false;
    }
    public List<Access> findAllAccess(){
        return dao.selectList(null);
    }
}
