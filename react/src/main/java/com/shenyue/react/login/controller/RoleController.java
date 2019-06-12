package com.shenyue.react.login.controller;

import com.shenyue.react.login.entity.RoleEntity;
import com.shenyue.react.login.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.Role;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName RoleController
 * @Author 赵锟
 * @Date 2019/6/11 20:25
 * @Version 1.0
 **/

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;


    @RequestMapping("/getAll")
    public List<RoleEntity> getAll(){
        return roleService.selectAll();
    }
    @RequestMapping("/getByName")
    public List<RoleEntity> getByName( String name){
        return  roleService.selectByRoleName(name);
    }
    @RequestMapping("/getById")
    public RoleEntity getById(String id){
        return roleService.selectById(id);
    }
    @RequestMapping("/add")
    public void add(RoleEntity roleEntity){
        roleEntity.setId(UUID.randomUUID().toString());
        roleService.add(roleEntity);
    }
    @RequestMapping("/update")
    public void update(RoleEntity roleEntity){
        roleService.update(roleEntity);
    }
    @RequestMapping("/delete")
    public void delete(String id){
        roleService.delete(id);
    }

}
