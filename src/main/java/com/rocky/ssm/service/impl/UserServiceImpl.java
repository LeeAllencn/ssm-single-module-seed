package com.rocky.ssm.service.impl;

import com.rocky.ssm.dao.UserMapper;
import com.rocky.ssm.model.User;
import com.rocky.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rocky on 2017-12-19.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
