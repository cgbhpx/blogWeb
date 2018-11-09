package com.chai.testProj.service;
import com.chai.testProj.model.UserDao;
import java.util.List;

public interface UserService {
    int addUser(UserDao userDao);

    List<UserDao> queryUser();

    List<UserDao> queryUserById(String userId);

    List<UserDao> updateUser(UserDao userDao);

    int deleteUser(long userId);

}
