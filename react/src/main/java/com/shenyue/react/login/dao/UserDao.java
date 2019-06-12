package com.shenyue.react.login.dao;

import com.shenyue.react.login.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserDao
 * @Author 赵锟
 * @Date 2019/6/10 21:34
 * @Version 1.0
 **/
@Mapper
@Repository("userDao")
public interface UserDao {
    @Insert("inser into user (id,loginname,password,name,sex,age) values(#{id},#{loginName},#{password},#{name},#{sex},#{age})")
    Integer insert(UserEntity role);
    @Update("update user set loginname=#{loginName},password=#{password},name=#{name},sex=#{sex},age=#{age} where id=#{id}")
    Integer update(UserEntity role);
    @Select("delete from user where id=#{id}")
    Integer delete(String id);
    @Select("select * from user where id=#{id}")
    UserEntity selectById(String id);
    @Select("select * from user ")
    List<UserEntity> selectAll();
    @Select("select * from user where loginname=#{loginName}")
    List<UserEntity> selectByLoginName(String loginName);

}
