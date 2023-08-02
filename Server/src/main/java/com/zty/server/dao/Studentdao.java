package com.zty.server.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zty.server.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Studentdao extends BaseMapper<Student> {

}
