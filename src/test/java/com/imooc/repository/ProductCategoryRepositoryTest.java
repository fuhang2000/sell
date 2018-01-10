package com.imooc.repository;

import com.imooc.dataobjdect.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
    @Transactional /**不保存测试数据.(测试完成后回滚)*/
    public  void saveTest(){

/*更新*
    ProductCategory productCategory=repository.findOne(2);

    productCategory.setCategoryName("男性最爱");
    productCategory.setCategoryType(10);
    productCategory.setCreateTime(productCategory.getCreateTime());

    repository.save(productCategory);


    */

        ProductCategory productCategory=new ProductCategory("女性最爱",9,new Date());
        ProductCategory result=repository.save(productCategory);
        Assert.assertNotNull(result);
    }

@Test

public void  findBycatgoryTypeInTest(){


        List<Integer> list= Arrays.asList(2,9);


        List<ProductCategory> result=repository.findByCategoryTypeIn(list);

        Assert.assertNotEquals(0,result.size());

}

}