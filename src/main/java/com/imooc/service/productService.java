package com.imooc.service;

import com.imooc.dataobjdect.ProductInfo;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */
public interface productService {

    public ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<ProductInfo> findUpAll(Integer productStatus);

    /**
     * 分页查询所有商品
     * @param pageable
     * @return
     */
    Page findAll(org.springframework.data.domain.Pageable pageable);

    /**
     * 保存
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

//加库存


    //减库存
}
