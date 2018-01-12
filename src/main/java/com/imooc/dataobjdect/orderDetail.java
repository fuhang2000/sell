package com.imooc.dataobjdect;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/4.
 */

@Entity //实体
@DynamicUpdate//动态生成更新
@Data//包含 get set  toString
public class orderDetail {
@Id
@GeneratedValue
    private String detailId;
/**订单id*/
    private String  orderId;
/**商品id*/
    private String productId;
    /**商品名*/
    private String productName;
    /**单价*/
    private Double productPrice;
    /**商品数量*/
    private Integer productQuantity;
    /**商品图片*/
    private String productIcon;

    private Date createTime;

    private Date updateTime;





}
