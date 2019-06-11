package com.shenyue.react.login.controller;

import com.shenyue.react.login.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RoleController
 * @Author 赵锟
 * @Date 2019/6/11 20:25
 * @Version 1.0
 **/

@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;
    @RequestMapping("/login")
    public String test(){
        System.out.println(roleService.selectAll());
        return "123123";
    }
}
