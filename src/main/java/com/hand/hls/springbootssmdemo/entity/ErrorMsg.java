package com.hand.hls.springbootssmdemo.entity;


import org.springframework.validation.BindingResult;

import java.net.BindException;

/**
 * 错误提示信息实体类
 */

public class ErrorMsg {
    public String getMsg() {
        return msg;
    }



    public void setMsg(BindingResult bindingResult) {
        this.msg = bindingResult.getAllErrors().get(0).getDefaultMessage();
    }


    /**
     * 错误信息
     */
    private String msg;

}
