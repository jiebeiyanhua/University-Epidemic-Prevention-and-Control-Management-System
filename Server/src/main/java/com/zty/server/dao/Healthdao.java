package com.zty.server.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zty.server.entity.Health;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Healthdao extends BaseMapper<Health>{
}
