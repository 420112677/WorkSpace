package com.shenyue.react.login.service.impl;

import com.shenyue.react.login.dao.RoleAndUserDao;
import com.shenyue.react.login.entity.RoleAndUserEntity;
import com.shenyue.react.login.service.RoleAndUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleAndUserService")
public class RoleAndUserServiceImp implements RoleAndUserService {
    @Autowired
    private RoleAndUserDao roleAndUserDao;
    @Override
    public String update(RoleAndUserEntity roleAndUserEntity) {
        Integer row;
        try {
            row = roleAndUserDao.update(roleAndUserEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return "更新失败";
        }
        if (row > 0) {
            return "更新成功";
        } else {
            return "未找到该id";
        }
    }

    @Override
    public String add(RoleAndUserEntity roleAndUserEntity) {
        try {
            roleAndUserDao.insert(roleAndUserEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return "添加失败";
        }
        return "添加成功";
    }

    @Override
    public String delete(String id) {
        Integer row = roleAndUserDao.delete(id);
        if (row > 0) {
            return "删除成功";
        } else {
            return "未找到此id";
        }
    }

    @Override
    public RoleAndUserEntity selectById(String id) {
        return roleAndUserDao.selectById(id);
    }

    @Override
    public RoleAndUserEntity selectByUserId(String userId) {
        return roleAndUserDao.selectByUserId(userId);
    }

    @Override
    public List<RoleAndUserEntity> selectByRoleId(String roleId) {
        return roleAndUserDao.selectByRoleId(roleId);
    }
}
