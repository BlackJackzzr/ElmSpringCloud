package com.example.orderserver10600.po;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 12:08
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 *@ClassName OrderDetailed
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 12:08
 *@Version 1.0
 */
@Data
public class OrderDetailed {
    @TableId(value="od_id")
    private Integer orderDetailedId;
    @TableField(value="order_id")
    private Integer orderId;
    @TableField(value="food_id")
    private Integer foodId;
    @TableField(value="quantity")
    private Integer quantity;
}
