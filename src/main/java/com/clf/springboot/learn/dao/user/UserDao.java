package com.clf.springboot.learn.dao.user;

import com.clf.springboot.learn.model.user.User;
import com.clf.springboot.learn.model.user.UserQuery;

public interface UserDao {

    public User queryUserById(UserQuery userQuery);
}
