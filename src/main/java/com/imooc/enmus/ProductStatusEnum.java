package com.imooc.enmus;

import lombok.Getter;

/**
 * 商品状态
 * Created by Administrator on 2018/1/11.
 */
@Getter
public enum ProductStatusEnum {


    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;
    private String  msg;
    ProductStatusEnum(){


    }

    ProductStatusEnum(int i, String msg) {
        this.code=i;
        this.msg=msg;
    }
}
