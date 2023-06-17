package com.example.businessserver10300.po;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-13
 * Time: 16:51
 */

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 *@ClassName Business
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/13 16:51
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
