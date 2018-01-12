package com.imooc.serviceimpl;

import com.imooc.dataobjdect.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/1/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryServices;

    @Test
    public void findOne()  {
        ProductCategory productCategory=categoryServices.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> l=categoryServices.findAll();
        Assert.assertNotEquals(0,l.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> listtypeId= Arrays.asList(1,2);
        List<ProductCategory> l=categoryServices.findByCategoryTypeIn(listtypeId);
        Assert.assertNotEquals(0,l.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("gg");
        productCategory.setCreateTime(new Date());
        productCategory.setCategoryType(5);
        categoryServices.save(productCategory);

    }

}