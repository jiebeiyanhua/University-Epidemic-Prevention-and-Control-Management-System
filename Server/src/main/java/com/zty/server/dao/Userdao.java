package com.zty.server.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zty.server.entity.User;
import org.apache.ibatis.annotations.Mapper;
//dao:数据访问对象
//extends：继承，子类继承父类的方法
//BaseMapper<User>：<User> ,表示泛型，
// 这里就是说明当前这个dao，操作的是实体类User对相应的表
// interface： 接口，表示定义了方法，但是没有方法的实现。
//   比如：定义了一个”int insert(T entity);“方法
// mybatis plus 框架，根据实体类中配置的表和实体类的关系，完成实现类。
@Mapper //  让框架 完成 UserDao的实现类的对象的创建
public interface Userdao
        extends BaseMapper<User> {
}
