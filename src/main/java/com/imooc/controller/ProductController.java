package com.imooc.controller;

import com.imooc.VO.ProductInfoVO;
import com.imooc.VO.ProductVO;
import com.imooc.VO.ResultVO;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/1/11.
 */
@RestController
@RequestMapping("/buyer/Product")
public class ProductController {
@GetMapping("/list")
    public ResultVO List(){
        ResultVO r=new ResultVO();
    r.setCode(0);
    r.setMsg("成功");

    ProductVO productVO= new ProductVO();
    productVO.setCategroyName("热榜");
    productVO.setCategroyType(1);


    ProductInfoVO pvo=new ProductInfoVO();
    pvo.setProductId("PDSRZ");
    pvo.setProductName("皮蛋粥");


    productVO.setProductInfoVO(Arrays.asList(pvo));

    r.setData(productVO);
return  r;

    }
}
