package com.clf.springboot.learn.dao.user;

import com.clf.springboot.learn.model.user.User;
import com.clf.springboot.learn.model.user.UserQuery;

import java.util.List;

public interface UserDao {

    public User queryUserById(UserQuery userQuery);

    List<User> getAllUser(UserQuery userQuery);
}
