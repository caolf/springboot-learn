package com.clf.springboot.learn.service.user;

import com.clf.springboot.learn.model.user.User;
import com.clf.springboot.learn.model.user.UserQuery;

import java.util.List;


public interface UserService {

    public User queryUserById(String id);

    public List<User> getAllUser();

    public User saveUser(User user);
}
