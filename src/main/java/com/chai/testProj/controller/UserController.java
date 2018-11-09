package com.chai.testProj.controller;

import com.chai.testProj.model.UserDao;
import com.chai.testProj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@Valid UserDao userDao){
        userDao.setUserName(userDao.getUserName());
        userDao.setUserPwd(userDao.getUserPwd());
        int result = userService.addUser(userDao);
        return "200";
    }

    @RequestMapping(value ="/queryUser",method = RequestMethod.POST)
    public List queryUser(){
        return userService.queryUser();
    }

    @RequestMapping(value = "/queryUserById",method = RequestMethod.POST)
    public List queryUserById(String userId){
        return userService.queryUserById(userId);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public List updateUser(UserDao userDao){
        return userService.updateUser(userDao);
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    public int deleteUser(long userId){
        return userService.deleteUser(userId);
    }
}
