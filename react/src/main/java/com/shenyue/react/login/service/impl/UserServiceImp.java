package com.shenyue.react.login.service.impl;

import com.shenyue.react.login.dao.RoleDao;
import com.shenyue.react.login.dao.UserDao;
import com.shenyue.react.login.entity.RoleEntity;
import com.shenyue.react.login.entity.UserEntity;
import com.shenyue.react.login.service.RoleService;
import com.shenyue.react.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName RoleServiceImp
 * @Author 赵锟
 * @Date 2019/6/11 20:22
 * @Version 1.0
 **/
@Service("userService")
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public String update(UserEntity userEntity) {
        Integer row;
        try {
            row = userDao.update(userEntity);
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
    public String add(UserEntity userEntity) {
        try {
            userDao.insert(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
            return "添加失败";
        }
        return "添加成功";
    }


    @Override
    public String delete(String id) {
        Integer row = userDao.delete(id);
        if (row > 0) {
            return "删除成功";
        } else {
            return "未找到此id";
        }
    }

    @Override
    public UserEntity selectById(String id) {
        return userDao.selectById(id);
    }

    @Override
    public List<UserEntity> selectAll() {
        return userDao.selectAll();
    }

    @Override
    public List<UserEntity> selectByLoginName(String loginName) {
        return userDao.selectByLoginName(loginName);
    }

}
