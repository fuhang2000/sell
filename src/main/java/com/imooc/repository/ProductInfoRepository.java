package com.imooc.repository;

import com.imooc.dataobjdect.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
public interface  ProductInfoRepository extends JpaRepository<ProductInfo,String> {

 public List<ProductInfo> findByProductStatus(Integer productStatus);



}
