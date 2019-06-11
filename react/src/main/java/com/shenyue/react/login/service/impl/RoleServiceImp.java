package com.shenyue.react.login.service.impl;

import com.shenyue.react.login.dao.RoleDao;
import com.shenyue.react.login.entity.RoleEntity;
import com.shenyue.react.login.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName RoleServiceImp
 * @Author 赵锟
 * @Date 2019/6/11 20:22
 * @Version 1.0
 **/
@Service("roleService")
public class RoleServiceImp implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public void update(RoleEntity roleEntity) {
        roleDao.update(roleEntity);
    }

    @Override
    public void add(RoleEntity roleEntity) {
        roleDao.insert(roleEntity);
    }

    @Override
    public void delete(int id) {
     roleDao.delete(id);
    }

    @Override
    public RoleEntity selectById(int id) {
        return roleDao.selectById(id);
    }

    @Override
    public List<RoleEntity> selectAll() {
        return roleDao.selectAll();
    }

    @Override
    public List<RoleEntity> selectByRoleName(String name) {
        return roleDao.selectByName(name);
    }
}
