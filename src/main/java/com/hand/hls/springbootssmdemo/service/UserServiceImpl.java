package com.hand.hls.springbootssmdemo.service;


import com.hand.hls.springbootssmdemo.entity.User;

import com.hand.hls.springbootssmdemo.mapper.UserMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;



import java.util.List;

/**
 * Service实现类
 */
@Service
@Repository
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(int userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public int createUser( User user) {
        return  userMapper.createUser(user);

    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(int userId) {
        return userMapper.deleteUser(userId);
    }
}

