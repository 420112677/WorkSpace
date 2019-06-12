package com.shenyue.react.login.service;


import com.shenyue.react.login.entity.RoleAndUserEntity;
import com.shenyue.react.login.entity.UserEntity;

import java.util.List;

/**
 * @ClassName RoleService
 * @Author 赵锟
 * @Date 2019/6/11 20:13
 * @Version 1.0
 **/

public interface RoleAndUserService {
    String update(RoleAndUserEntity roleAndUserEntity);
    String add(RoleAndUserEntity roleAndUserEntity);
    String delete(String id);
    RoleAndUserEntity  selectById(String id);
    RoleAndUserEntity selectByUserId(String userId);
    List<RoleAndUserEntity> selectByRoleId(String roleId);
}