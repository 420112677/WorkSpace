package com.shenyue.react.login.dao;
import com.shenyue.react.login.entity.RoleEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName RoleDao
 * @Author 赵锟
 * @Date 2019/6/10 21:34
 * @Version 1.0
 **/
@Mapper
@Repository
public interface RoleDao {
    @Insert("insert into role (id,rolename) values (#{id},#{roleName})")
    Integer insert(RoleEntity role);
    @Update("update role set rolename=#{roleName} where id=#{id}")
    Integer update(RoleEntity role);
    @Delete("delete from role where id=#{id}")
    Integer delete(String id);
    @Select("select * from role where id=#{id}")
    RoleEntity selectById(String id);
    @Select("select * from role")
    List<RoleEntity> selectAll();
    @Select("select * from role where rolename=#{name}")
    List<RoleEntity> selectByName(String name);

}
