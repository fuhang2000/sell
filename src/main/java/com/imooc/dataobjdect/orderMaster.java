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
public class orderMaster {
    @Id
    @GeneratedValue
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;
/*购买者 微信openId*/
    private String  buyerOpenid;
/*订单状态 默认0 新增订单*/
    private  Integer orderStatus;
/*支付状态 0  默认未支付*/
    private  Integer payStatus;

    private Date createTime;

    private Date updateTime;




}
