package com.bangbang.baseframe.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

/**
 * @Description 管理员、用户父类
 * @Author Loca
 * @Date 2018/12/28 0028 11:15
 **/
@MappedSuperclass
@EntityListeners(value = {AuditingEntityListener.class})
public class OperaterDO extends BaseDO{

    /**
     * 用户名
     */
    @Column(name = "username")
    protected String username;

    /**
     * 登陆账户
     */
    @Column(name = "account")
    protected String account;

    /**
     * 权限角色
     */
    @Column(name = "role")
    protected String role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
