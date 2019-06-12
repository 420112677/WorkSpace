package com.shenyue.react.login.service;


import com.shenyue.react.login.entity.UserEntity;

import java.util.List;

/**
 * @ClassName RoleService
 * @Author 赵锟
 * @Date 2019/6/11 20:13
 * @Version 1.0
 **/

public interface UserService {
    String update(UserEntity userEntity);
    String add(UserEntity userEntity);
    String delete(String id);
    UserEntity selectById(String id);
    List<UserEntity> selectAll();
    List<UserEntity> selectByLoginName(String loginName);
}