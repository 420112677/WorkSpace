package com.shenyue.react.login.dao;
import com.shenyue.react.login.entity.RoleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName RoleDao
 * @Author 赵锟
 * @Date 2019/6/10 21:34
 * @Version 1.0
 **/
@Repository("roleDao")
public interface RoleDao {
    void insert(RoleEntity role);
    void update(RoleEntity role);
    void delete(int id);
    RoleEntity selectById(int id);
    List<RoleEntity> selectAll();
    List<RoleEntity> selectByName(String name);

}
