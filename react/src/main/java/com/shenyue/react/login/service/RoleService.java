package com.shenyue.react.login.service;

import com.shenyue.react.login.entity.RoleEntity;

import java.util.List;

/**
 * @ClassName RoleService
 * @Author 赵锟
 * @Date 2019/6/11 20:13
 * @Version 1.0
 **/

public interface RoleService {
    String update(RoleEntity roleEntity);
    String add(RoleEntity roleEntity);
    String delete(String id);
    RoleEntity selectById(String id);
    List<RoleEntity> selectAll();
    List<RoleEntity> selectByRoleName(String name);
}