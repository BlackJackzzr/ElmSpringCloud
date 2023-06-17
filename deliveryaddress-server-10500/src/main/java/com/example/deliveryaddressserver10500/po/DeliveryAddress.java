package com.example.deliveryaddressserver10500.po;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 11:36
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 *@ClassName DeliveryAddress
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 11:36
 *@Version 1.0
 */
@Data
public class DeliveryAddress {
    @TableId(value="da_id")
    private Integer daId;
    @TableField(value="contact_name")
    private String contactName;
    @TableField(value="contact_sex")
    private Integer contactSex;
    @TableField(value="contact_tel")
    private String contactTel;
    @TableField(value="address")
    private String address;
    @TableField(value="user_id")
    private String userId;
}
