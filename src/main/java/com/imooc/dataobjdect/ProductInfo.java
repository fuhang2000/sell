package com.imooc.dataobjdect;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/4.
 */
@Entity //实体
@DynamicUpdate//动态生成更新
@Data//包含 get set  toString
public class ProductInfo {

    private String productId;
    /**商品名 */
    private String productName;
/** 商品价格*/
    private String    productPrice;
    /** 商品库存*/
    private Integer productStock;
    /** 描述*/
    private String productDescription;
    /** 图片*/
    private String productIcon;
    /** 种类*/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;









}
