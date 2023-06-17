package com.example.orderserver10600.po;/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 周门
 * Date: 2023-06-14
 * Time: 12:08
 */

import lombok.Data;

/**
 *@ClassName OrderBusinessVo
 *@Description TODO
 *@Author 周门
 *@Date 2023/6/14 12:08
 *@Version 1.0
 */
@Data
public class OrderBusinessVo {
    private Integer orderId;

    private String businessName;

    private Double orderTotal;

    private Integer orderState;

    private Double deliveryPrice;
}
