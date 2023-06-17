package com.example.userserver10100.po;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-11
 * Time: 15:40
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Builder;
import lombok.Data;

/**
 *@ClassName User
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/11 15:40
 *@Version 1.0
 */
@Data
@Builder
public class User {
    @TableId(value="user_id",type = IdType.INPUT)
    private String userId;
    @TableField(value="password")
    private String password;
    @TableField(value="user_name")
    private String userName;
    @TableField(value="user_sex")
    private Integer userSex;
    @TableField(value="user_img")
    private String userImg;
    @TableField(value="del_tag")
    private Integer delTag;
}
