package com.clf.springboot.learn.web.user;

import com.clf.springboot.learn.model.user.UserQuery;
import com.clf.springboot.learn.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {

    private Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/getUserById",method = {RequestMethod.GET,RequestMethod.POST})
    public Object getUserById(UserQuery userQuery){

        if(userQuery==null || userQuery.getId()==null)
            return null;
        else
            return userService.queryUserById(userQuery.getId());
    }
}
