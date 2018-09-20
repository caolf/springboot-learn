package com.clf.springboot.learn.web.user;

import com.clf.springboot.learn.model.user.User;
import com.clf.springboot.learn.model.user.UserQuery;
import com.clf.springboot.learn.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@RestController
public class UserController {

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

    /**
     * 查询所有用户
     * @param userQuery
     * @return
     */
    @RequestMapping(value = "/user/getAllUser",method = {RequestMethod.GET,RequestMethod.POST})
    public Object getAllUser(UserQuery userQuery){

        if(userQuery==null)
            return null;
        else
            return userService.getAllUser();
    }

    @RequestMapping(value = "/lzc_web/login",method = {RequestMethod.GET,RequestMethod.POST})
    public Object getUserById(HttpServletResponse response, HttpServletRequest request){
        User user=new User();
        user.setId("123");
        user.setRealName("老板");

        String uuid=null;
        if(uuid==null){
            uuid= UUID.randomUUID().toString().toLowerCase();
        }
        response.addCookie(new Cookie("userName","张三"));
        response.addCookie(new Cookie("id","123"));
        response.addCookie(new Cookie("uuid",uuid.toString()));

        return "登陆成功！欢迎！";
    }
}
