package com.imooc.serviceimpl;

import com.imooc.dataobjdect.ProductCategory;
import com.imooc.repository.ProductCategoryRepository;
import com.imooc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productRepository;
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return productRepository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryIdlist) {


        return productRepository.findByCategoryTypeIn(categoryIdlist);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) throws Exception {


     return    productRepository.save(productCategory);
    }
}
