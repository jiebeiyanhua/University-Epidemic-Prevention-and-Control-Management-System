package com.zty.server.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zty.server.entity.Travel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Traveldao extends BaseMapper<Travel> {
}
