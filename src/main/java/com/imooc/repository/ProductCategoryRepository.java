package com.imooc.repository;

import com.imooc.dataobjdect.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    /*查询*/
    public ProductCategory findOne(Integer categoryId) ;
    /*查询所有*/
    public List<ProductCategory> findAll();
    /*查询集合中的类目*/
    public  List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryIdlist);

    public ProductCategory  save(ProductCategory productCategory);

}
