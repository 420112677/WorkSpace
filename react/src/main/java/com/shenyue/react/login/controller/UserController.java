package com.shenyue.react.login.controller;

import com.shenyue.react.login.entity.RoleAndUserEntity;
import com.shenyue.react.login.entity.RoleEntity;
import com.shenyue.react.login.entity.UserEntity;
import com.shenyue.react.login.service.RoleAndUserService;
import com.shenyue.react.login.service.RoleService;
import com.shenyue.react.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @ClassName RoleController
 * @Author 赵锟
 * @Date 2019/6/11 20:25
 * @Version 1.0
 **/

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleAndUserService roleAndUser;

    @RequestMapping("/getAll")
    public List<UserEntity> getAll(){
        return userService.selectAll();
    }
    @RequestMapping("/getByName")
    public List<UserEntity> getByName( String name){
        return  userService.selectByLoginName(name);
    }
    @RequestMapping("/getById")
    public UserEntity getById(String id){
        return userService.selectById(id);
    }
    /**新增用户时要新添加权限 ，所以要保存相关的权限信息*/
    @RequestMapping("/add")
    public void add(UserEntity userEntity,String roleId){
        userEntity.setId(UUID.randomUUID().toString());
        //新增user对象
        userService.add(userEntity);
        //添加关联关系，目前只考虑1v1
        RoleAndUserEntity relation=new RoleAndUserEntity();
        relation.setId(UUID.randomUUID().toString());
        relation.setUserId(userEntity.getId()+"");
        relation.setRoleId(roleId);
        roleAndUser.add(relation);
    }
    @RequestMapping("/update")
    public void update(UserEntity userEntity,String roleId){
        userService.update(userEntity);
        RoleAndUserEntity relation=roleAndUser.selectByUserId(userEntity.getId()+"");
        if (relation!=null){
            relation.setRoleId(roleId);
            roleAndUser.update(relation);
        }else{
            relation=new RoleAndUserEntity();
            relation.setId(UUID.randomUUID().toString());
            relation.setUserId(userEntity.getId()+"");
            relation.setRoleId(roleId);
            roleAndUser.add(relation);
        }
    }
    @RequestMapping("/delete")
    public void delete(String id){
        UserEntity user=userService.selectById(id);
        //能找到该对象
        if(user!=null){
            //找该用户是否有对应的权限关系，如果有则删除，没有则直接删除该用户
            RoleAndUserEntity relation=roleAndUser.selectByUserId(user.getId()+"");
            if (relation!=null) {
                roleAndUser.delete(relation.getId());
            }
            userService.delete(id);
        }


    }

}
