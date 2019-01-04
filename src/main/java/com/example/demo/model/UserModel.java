package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserModel extends BaseModel {
    @Column(nullable = false, columnDefinition = "varchar(10) COMMENT '姓名'")
    private String name;
    @Column(unique = true, nullable = false, columnDefinition = "varchar(11) COMMENT '电话号码'")
    private String mobile;
    @Column(nullable = false, columnDefinition = "varchar(64) COMMENT '密码'")
    @JsonIgnore
    private String password;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
