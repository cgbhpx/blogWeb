package com.chai.testProj.service.impl;
import com.chai.testProj.mapper.UserMapper;
import com.chai.testProj.model.UserDao;
import com.chai.testProj.service.UserService;
import com.chai.testProj.utils.CreateId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(UserDao userDao) {
        CreateId createId = new CreateId();
        userDao.setUserId(Integer.parseInt(createId.getUUID()));
        userDao.setCreateData(new Date());
        return userMapper.addUser(userDao);
    }

    @Override
    public List<UserDao> queryUser() {
        return userMapper.queryUser();
    }

    @Override
    public List<UserDao> queryUserById(String userId) {
        return userMapper.queryUserById(Integer.parseInt(userId));
    }

    @Override
    public List<UserDao> updateUser(UserDao userDao) {
        userDao.setUpdateDate(new Date());
        return userMapper.updateUser(userDao);
    }

    @Override
    public int deleteUser(long userId) {
        return userMapper.deleteUser(userId);
    }
}
