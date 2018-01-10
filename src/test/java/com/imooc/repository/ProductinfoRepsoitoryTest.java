package com.imooc.repository;

import com.imooc.dataobjdect.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/1/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest

public class ProductinfoRepsoitoryTest  {
    @Autowired
private ProductInfoRepository productinfoRepsoitory;


    @Test
    public void findOne() throws Exception {
        ProductInfo p=  productinfoRepsoitory.findOne("PDXSZ");
        Assert.assertNotNull(p);
    }

    @Test
    public void findAll() throws Exception {

List<ProductInfo> productInfoList=productinfoRepsoitory.findAll();
Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findProductStatus() throws Exception {
        List<ProductInfo> list=  productinfoRepsoitory.findByProductStatus(0);
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void save() throws Exception {

        ProductInfo p=  new ProductInfo();
        p.setCategoryType(5);
        p.setCreateTime(new Date());
        p.setProductDescription("123好吃");
        p.setProductName("皮蛋粥");
        p.setProductIcon("www");
        p.setProductId("PDXSZ");
        p.setProductPrice("3.2");
        p.setProductStock(100);
        productinfoRepsoitory.save(p);
    }
@Test
    public void  findByProductcategoryTypeIn(){
        List<Integer> list=  Arrays.asList(1,5);
      List<ProductInfo>  productInfoList= productinfoRepsoitory.findBycategoryTypeIn(list);
        Assert.assertNotEquals(0,list.size());

    }

}