package com.imooc.serviceimpl;

import com.imooc.dataobjdect.ProductCategory;
import com.imooc.service.CategoryService;

import java.util.List;

/**
 * Created by Administrator on 2018/1/10.
 */
public class CategoryServiceImpl implements CategoryService {
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return null;
    }

    @Override
    public List<ProductCategory> findAll() {
        return null;
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryIdlist) {
        return null;
    }

    @Override
    public void save() throws Exception {

    }
}
