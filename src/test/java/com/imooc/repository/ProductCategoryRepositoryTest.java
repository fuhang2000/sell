package com.imooc.repository;

import com.imooc.dataobjdect.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;
/**运行类*/
@RunWith(SpringRunner.class)
/**SpringBoot测试*/
@SpringBootTest
public class ProductCategoryRepositoryTest {

@Autowired
/**注入*/
private ProductCategoryRepository repository;

@Test
    public void  findoneTest(){
    /**调用hibernate方法*/
    ProductCategory productCategory=repository.findOne(1);
    System.out.println("productCategory---------------------------");
    System.out.println("productCategory"+productCategory.toString());
}

@Test
    public  void saveTest(){

    ProductCategory productCategory=repository.findOne(2);

    productCategory.setCategoryName("男性最爱");
    productCategory.setCategoryType(10);
    productCategory.setCreateTime(productCategory.getCreateTime());

    repository.save(productCategory);
}
}