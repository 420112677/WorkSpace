package com.shenyue.react.login.dao;

import com.shenyue.react.login.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName UserDao
 * @Author 赵锟
 * @Date 2019/6/10 21:34
 * @Version 1.0
 **/
@Repository("userDao")
public interface UserDao {
    void insert(UserEntity role);

    void update(UserEntity role);

    void delete(int id);

    UserEntity selectById(int id);

    List<UserEntity> selectAll();

    List<UserEntity> selectByName(String name);

}
