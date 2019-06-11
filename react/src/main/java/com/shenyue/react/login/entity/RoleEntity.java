package com.shenyue.react.login.entity;

import lombok.Data;

/**
 * 角色表
 * @ClassName RoleEntity
 * @Author 赵锟
 * @Date 2019/6/10 21:23
 * @Version 1.0
 **/
@Data
public class RoleEntity {
    /**唯一id*/
    private Integer id;
    /**角色名称*/
    private String roleName;
}
