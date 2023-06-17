package com.example.orderserver10600.po;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 12:06
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 *@ClassName Orders
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 12:06
 *@Version 1.0
 */
@Data
public class Orders {
    @TableId(value="order_id")
    private Integer orderId;
    @TableField(value="user_id")
    private String userId;
    @TableField(value="business_id")
    private Integer businessId;
    @TableField(value="order_date")
    private String orderDate;
    @TableField(value="order_total")
    private Double orderTotal;
    @TableField(value="da_id")
    private Integer daId;
    @TableField(value="order_state")
    private Integer orderState;
}
