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
public class UserDO extends OperaterDO{

    /**
     * 性别 0-女 1-男 2-未知
     */
    @Column(name = "gender")
    private Integer gender;

    /**
     * 拥有的积分
     */
    @Column(name = "points")
    private Long points;

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }
}
