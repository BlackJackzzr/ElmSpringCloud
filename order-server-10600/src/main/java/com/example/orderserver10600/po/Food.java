package com.example.orderserver10600.po;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-12
 * Time: 21:23
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 *@ClassName Food
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/12 21:23
 *@Version 1.0
 */
@Data
public class Food {
    @TableId(value="food_id")
    private Integer foodId;
    @TableField(value="food_name")
    private String foodName;
    @TableField(value="food_exception")
    private String foodException;
    @TableField(value="food_price")
    private Double foodPrice;
    @TableField(value="business_id")
    private Integer businessId;
    @TableField(value="food_img")
    private String foodImg;
    @TableField(value="remarks")
    private String remarks;
}
