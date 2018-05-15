package com.clf.springboot.learn.service.user;

import com.clf.springboot.learn.dao.user.UserDao;
import com.clf.springboot.learn.model.user.User;
import com.clf.springboot.learn.model.user.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User queryUserById(String id) {
        UserQuery userQuery=new UserQuery();
        userQuery.setId(id);
        return userDao.queryUserById(userQuery);
    }
}
