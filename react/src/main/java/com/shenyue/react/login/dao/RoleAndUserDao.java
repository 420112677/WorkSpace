package com.shenyue.react.login.dao;

import com.shenyue.react.login.entity.RoleAndUserEntity;

import java.util.List;

/**
 * @ClassName RoleAndUserDao
 * @Author 赵锟
 * @Date 2019/6/11 19:58
 * @Version 1.0
 **/
public interface RoleAndUserDao {
    void insert(RoleAndUserEntity entity);
    void update(RoleAndUserEntity entity);
    void delete(int id);
    RoleAndUserEntity  selectById(int id);
    List<RoleAndUserEntity> selectByRoleId(String roleId);
    List<RoleAndUserEntity> selectByUserId(String userId);

}
