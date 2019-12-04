package com.hand.hls.springbootssmdemo.controller;


import com.hand.hls.springbootssmdemo.entity.ErrorMsg;
import com.hand.hls.springbootssmdemo.entity.User;
import com.hand.hls.springbootssmdemo.service.UserServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Controller类
 */
@RestController
@RequestMapping("/user")
@Validated
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> list(){

        return userService.list();
    }
    @PostMapping("/create")
    @Transactional(rollbackFor = Exception.class)
    public User createUser(@RequestBody @Valid  User user,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ErrorMsg erm=new ErrorMsg();
            erm.setMsg(bindingResult);
            throw new IllegalArgumentException(erm.getMsg());
        }
        int count = userService.createUser(user);
        if(count>0){
            return user;
        } else{ return null;}



    }
    @PutMapping("/update{userId}")
    @Transactional(rollbackFor = Exception.class)
    public User updateUser( @PathVariable("userId")  Integer userId,@RequestBody @Valid User user,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ErrorMsg erm=new ErrorMsg();
            erm.setMsg(bindingResult);
            throw new IllegalArgumentException(erm.getMsg());
        }
        if(userId==null)
        {
            throw new IllegalArgumentException("用户ID不能为空！");

        }
      int count = userService.updateUser(user);
        if(count>0) {
            return user;
        }
        else {
            return null;
        }
    }
    @DeleteMapping("/delete{userId}")
    @Transactional(rollbackFor = Exception.class)
    public int deleteById(@PathVariable("userId")  Integer userId,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ErrorMsg erm=new ErrorMsg();
            erm.setMsg(bindingResult);
            throw new IllegalArgumentException(erm.getMsg());
        }
        if(userId==null)
        {

            throw new IllegalArgumentException("用户ID不能为空！");


        }
         return userService.deleteUser(userId);

    }
    @GetMapping("/getUser{userId}")
    @Transactional(rollbackFor = Exception.class)
    public User getUserById( @PathVariable("userId")  Integer userId){
        if(userId==null) {
            throw new IllegalArgumentException("用户ID不能为空！");
        }

        User user = userService.getUserById(userId);
        if(user==null){

            throw new IllegalArgumentException("查无此用户！");
        }
        return user;
    }




}

