package com.web;

/**
 * Created by liuhaiyang on 2017/6/2.
 */
public class User {
    private String name;
    private String age;
    private String msg;

    public User() {
    }

    public User(String name, String age, String msg) {
        this.name = name;
        this.age = age;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
