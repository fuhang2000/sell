package com.imooc.repository;

import com.imooc.dataobjdect.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
public interface  ProductInfoRepository extends JpaRepository<ProductInfo,String> {

  public ProductInfo findOne(String productId);


    public List<ProductInfo> findAll();

    public List<ProductInfo> findByProductStatus(Integer productStatus);

    public List<ProductInfo> findBycategoryTypeIn(List<Integer> s);


    //  public List<ProductInfo> findcategroyTypeIn(List<Integer> categroyTypelist);

  //  public ProductInfo save(ProductInfo productInfo);

}
