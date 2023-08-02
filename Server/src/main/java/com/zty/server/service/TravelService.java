package com.zty.server.service;

import com.zty.server.dao.Traveldao;
import com.zty.server.entity.Travel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {
    @Autowired
    Traveldao dao;
    //增删改查
    public Boolean addTravel(Travel travel){
        int row = dao.insert(travel);
        return row > 0 ? true:false;
    }
    public Boolean deleteTravel(Integer id){
        int row = dao.deleteById(id);
        return row > 0 ? true:false;
    }
    public Boolean updateTravel(Travel travel){
        int row = dao.updateById(travel);
        return row > 0 ? true:false;
    }
    public List<Travel> findAllTravel(){
        return dao.selectList(null);
    }   
    
}
