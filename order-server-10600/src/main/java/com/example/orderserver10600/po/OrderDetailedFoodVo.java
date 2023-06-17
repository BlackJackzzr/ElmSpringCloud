package com.example.orderserver10600.po;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 12:09
 */

import lombok.Data;

/**
 *@ClassName OrderDetailedFoodVo
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 12:09
 *@Version 1.0
 */
@Data
public class OrderDetailedFoodVo {
    private Integer odId;
    private String foodName;
    private Integer quantity;
    private Double foodPrice;
}
