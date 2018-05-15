package com.clf.springboot.learn.service.user;

import com.clf.springboot.learn.model.user.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImpTest {

    private Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private  UserService userService;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void queryUserById() {
        User user = userService.queryUserById("123456");
        log.info(""+user.getId()+"  "+user.getUserName());
        Assert.assertNotNull(user);
    }
}