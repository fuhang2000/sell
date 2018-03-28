package com.imooc.VO;

import lombok.Data;

import java.math.BigDecimal;

/**商品 信息
 * Created by Administrator on 2018/1/11.
 */
@Data
public class ProductInfoVO {

    private  String  productName;

    private String  productId;

    private BigDecimal productPrice;
}
