package com.shenyue.react.login.dao;

import com.shenyue.react.login.entity.RoleAndUserEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName RoleAndUserDao
 * @Author 赵锟
 * @Date 2019/6/11 19:58
 * @Version 1.0
 **/
@Mapper
@Repository
public interface RoleAndUserDao {
    @Insert("insert into roleanduser (id,role_id,user_id) values(#{id},#{roleId},#{userId})")
    Integer insert(RoleAndUserEntity entity);
    @Update("update roleanduser set role_id=#{roleId},user_id=#{userId} where id=#{id}")
    Integer update(RoleAndUserEntity entity);
    @Delete("delete from roleanduser where id=#{id}")
    Integer delete(String id);
    @Select("select * from roleanduser where id=#{id}")
    RoleAndUserEntity  selectById(String id);
    @Select("select * from roleanduser where id=#{roleId}")
    List<RoleAndUserEntity> selectByRoleId(String roleId);
    @Select("select * from roleanduser where id=#{userId}")
    RoleAndUserEntity selectByUserId(String userId);

}
