package com.example.orderserver10600.po;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 12:04
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 *@ClassName Business
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 12:04
 *@Version 1.0
 */
@Data
public class Business {
    @TableId(value="business_id")
    private Integer businessId;
    @TableField(value="business_name")
    private String businessName;
    @TableField(value="business_address")
    private String businessAddress;
    @TableField(value="business_explain")
    private String businessExplain;
    @TableField(value="start_price")
    private Double startPrice;
    @TableField(value="delivery_price")
    private Double deliveryPrice;
    @TableField(value="business_img")
    private String businessImg;
    @TableField(value="order_type_id")
    private Integer orderTypeId;
    @TableField(value="remarks")
    private String remarks;
}
