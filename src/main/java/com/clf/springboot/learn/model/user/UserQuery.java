package com.clf.springboot.learn.model.user;

import java.io.Serializable;

public class UserQuery implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String realName;//真实姓名名字

    private String userName;//用户名称

    private String passWord;//用户密码

    private String userType;//用户类型

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getType() {
        return userType;
    }

    public void setType(String userType) {
        this.userType = userType;
    }
}
