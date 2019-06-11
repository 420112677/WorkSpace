package com.shenyue.react.login.service;

import com.shenyue.react.login.dao.RoleDao;
import com.shenyue.react.login.entity.RoleEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName RoleService
 * @Author 赵锟
 * @Date 2019/6/11 20:13
 * @Version 1.0
 **/

public interface RoleService {
    void update(RoleEntity roleEntity);
    void add(RoleEntity roleEntity);
    void delete(int id);
    RoleEntity selectById(int id);
    List<RoleEntity> selectAll();
    List<RoleEntity> selectByRoleName(String name);
}