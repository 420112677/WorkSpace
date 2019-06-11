package com.shenyue.react.login.entity;

import lombok.Data;

/**
 * 用户表，基础表
 * @ClassName UserEntity
 * @Author 赵锟
 * @Date 2019/6/10 21:28
 * @Version 1.0
 **/
@Data
public class UserEntity {
    private Integer id;
    /**用户名*/
    private String loginName;
    /**登陆密码*/
    private String password;
    /**用户名称*/
    private String name;
    /**性别*/
    private String sex;
    /**年龄*/
    private Integer age;
    /**角色id*/
    private String roleId;

}
