package com.hand.hls.springbootssmdemo.entity;



import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 *User 实体类
 */
public class User {
    @Min(value = 1000,message = "ID必须从1001开始")
    private int userId;
    @NotBlank(message = "用户名不能为空")
    private String userName;
    @Max(value = 100,message = "年龄必须小于100")
    @Min(value = 0,message = "年龄必须大于0")
    private int age;
    private Date createTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

