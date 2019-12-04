package com.hand.hls.springbootssmdemo.service;

import com.hand.hls.springbootssmdemo.entity.User;
import org.springframework.stereotype.Repository;


import java.util.List;
/**
 * User Service层
 */
@Repository
public interface UserService {
    /**
     * 通过userid查询用户
     * @param userId
     * @return 用户
     */
    public User getUserById(int userId);

    /**
     *查询用户列
     * @param
     * @return 用户列
     */
    public List<User> list();

    /**
     * 添加用户
     * @param user
     * @return user
     */
    public  int createUser(User user);

    /**
     * 修改用户
     * @param user
     * @return User
     */
    public int updateUser(User user);

    /**
     * 删除用户
     * @param userId
     * @return User
     */
    public int deleteUser(int userId);


}
