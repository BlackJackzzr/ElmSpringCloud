package com.example.cartserver10400.po;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 11:02
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 *@ClassName Cart
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 11:02
 *@Version 1.0
 */
@Data
public class Cart {
    @TableId(value="cart_id")
    private Integer cartId;
    @TableField(value="food_id")
    private Integer foodId;
    @TableField(value="business_id")
    private Integer businessId;
    @TableField(value="user_id")
    private String userId;
    @TableField(value="quantity")
    private Integer quantity;
}
