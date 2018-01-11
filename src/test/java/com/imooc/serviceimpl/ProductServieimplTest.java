package com.imooc.serviceimpl;

import com.imooc.dataobjdect.ProductInfo;
import com.imooc.enmus.ProductStatusEnum;
import com.imooc.repository.ProductInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/1/11.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServieimplTest {

    @Autowired
    private ProductServieimpl productInfoRepository;
    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo=productInfoRepository.findOne("PDSRZ");
        Assert.assertNotNull(productInfo);
    }

    @Test
    public void findUpAll() throws Exception {
List<ProductInfo> list=productInfoRepository.findUpAll(ProductStatusEnum.UP.getCode());
Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest request=new PageRequest(0,2);
        Page page=productInfoRepository.findAll(request);
        System.out.println("page:________"+page.getTotalElements());
    }

    @Test
    public void save() throws Exception {

        ProductInfo p=  new ProductInfo();
        p.setCategoryType(5);
        p.setCreateTime(new Date());
        p.setProductDescription("还不错");
        p.setProductName("八宝粥");
        p.setProductIcon("bwz");
        p.setProductId("BBZ");
        p.setProductPrice("4.0");
        p.setProductStatus(0);
        p.setProductStock(100);
       ProductInfo p1=productInfoRepository.save(p);

       Assert.assertNotNull(p1);
    }

}