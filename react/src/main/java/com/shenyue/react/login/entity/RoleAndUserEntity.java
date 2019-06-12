package com.shenyue.react.login.entity;

import lombok.Data;

/**
 * @ClassName RoleAndUserEntity
 * @Author 赵锟
 * @Date 2019/6/11 19:55
 * @Version 1.0
 **/
@Data
public class RoleAndUserEntity {
    /**关系表的id*/
    private String id;
    /**角色表Id*/
    private String roleId;
    /**用户表Id*/
    private String userId;
}
