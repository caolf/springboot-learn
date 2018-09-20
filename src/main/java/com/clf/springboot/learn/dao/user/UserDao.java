package com.clf.springboot.learn.dao.user;

import com.clf.springboot.learn.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Long> {

    User findById(String id);

    List<User> findAll();

    User save(User user);
}
