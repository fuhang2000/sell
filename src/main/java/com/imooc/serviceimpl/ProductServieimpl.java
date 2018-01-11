package com.imooc.serviceimpl;

import com.imooc.dataobjdect.ProductInfo;
import com.imooc.enmus.ProductStatusEnum;
import com.imooc.repository.ProductInfoRepository;
import com.imooc.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */
@Service
public class ProductServieimpl implements productService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public ProductInfo findOne(String productId) {
        return productInfoRepository.findOne(productId);
    }



    @Override
    public List<ProductInfo> findUpAll(Integer productStatus) {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
    @Override
    public Page findAll(Pageable pageable) {
        return productInfoRepository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoRepository.save(productInfo);
    }
}
