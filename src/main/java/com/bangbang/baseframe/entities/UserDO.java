package com.bangbang.baseframe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Description 用户实体类
 * @Author Loca
 * @Date 2018/12/28 0028 11:19
 **/
@Entity
@Table(name = "t_user",schema = "bangbang")
public class UserDO extends BaseDO {

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 登陆账户
     */
    @Column(name = "user_account")
    private String userAccount;

    /**
     * 密码
     */
    @Column(name = "password")
    private String password;

    /**
     * 用户权限等级,1-游客，2-普通用户,3-VIP用户，4-管理员，5-超级管理员
     */
    @Column(name = "role_level")
    private Integer roleLevel;
    /**
     * 性别 0-女 1-男 2-未知
     */
    @Column(name = "user_gender")
    private Integer userGender;

    /**
     * 拥有的积分
     */
    @Column(name = "user_points")
    private Long userPoints;

    /**
     * 用户头像关联Id,图片表
     */
    @Column(name = "picture_id")
    private Long pictureId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public Long getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(Long userPoints) {
        this.userPoints = userPoints;
    }

    public Long getPictureId() {
        return pictureId;
    }

    public void setPictureId(Long pictureId) {
        this.pictureId = pictureId;
    }
}
