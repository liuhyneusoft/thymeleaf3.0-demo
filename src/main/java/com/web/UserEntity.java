package com.web;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Administrator on 2017/6/4.
 */
public class UserEntity {

     private Integer id;

    @Size(max = 10,min = 2, message="备注: 长度2-10")
    @NotEmpty(message="name: 不能为空")
    @NotNull(message="name: 不能为空")
    private String username;

    private String password;
    private String petname;

    public UserEntity() {
    }

    public UserEntity(Integer id, String username, String password, String petname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.petname = petname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }
}
