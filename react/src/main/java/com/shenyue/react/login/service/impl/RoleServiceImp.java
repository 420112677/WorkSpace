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
    public String update(RoleEntity roleEntity) {
        Integer row;
        try {
            row=roleDao.update(roleEntity);
        }catch (Exception e){
            e.printStackTrace();
            return "更新失败";
        }
        if (row>0){
            return "更新成功";
        }else {
            return "未找到该id";
        }

    }

    @Override
    public String add(RoleEntity roleEntity) {

        try {
            roleDao.insert(roleEntity);
        }catch (Exception e){
            e.printStackTrace();
            return "添加失败";
        }
        return "添加成功";
    }

    @Override
    public String delete(String id) {
       Integer row= roleDao.delete(id);
       if (row>0) {
           return "删除成功";
       }else {
           return "未找到此id";
       }
    }

    @Override
    public RoleEntity selectById(String id) {
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
