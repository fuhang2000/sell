package com.imooc.controller;

import com.imooc.VO.ProductInfoVO;
import com.imooc.VO.ProductVO;
import com.imooc.VO.ResultVO;
import com.imooc.dataobjdect.ProductCategory;
import com.imooc.dataobjdect.ProductInfo;
import com.imooc.service.CategoryService;
import com.imooc.service.productService;
import com.imooc.serviceimpl.ProductServieimpl;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2018/1/11.
 */
@RestController
@RequestMapping("/buyer/Product")
public class ProductController {
    @Autowired
    private productService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO List() throws Exception {
        ResultVO r=new ResultVO();
        r.setCode(0);
        r.setMsg("成功");



    /*productVO.setCategroyName("热榜");
    productVO.setCategroyType(1);



    pvo.setProductId("PDSRZ");
    pvo.setProductName("皮蛋粥");
    pvo.setProductPrie(new BigDecimal("3.2"));

    productVO.setProductInfoVO(Arrays.asList(pvo));*/

        //查询上架商品
        List<ProductInfo> productInfoList= productService.findUpAll(0);

        //查询商品类目(一次性查询)

        List<Integer>  categoryList=new ArrayList();
        for (ProductInfo productInfo:productInfoList)
            categoryList.add(productInfo.getCategoryType()) ;

        List<ProductCategory> productCategoryList=categoryService.findByCategoryTypeIn(categoryList);

/* lambda表达式获取list
    categoryList= productInfoList.stream().map(e->e.getCategoryType()).collect(Collectors.toList());

    */

        //拼接数据
        List<ProductVO>     productVOList=new ArrayList();
        for (ProductCategory ss:productCategoryList) {
            ProductVO productVO= new ProductVO();
            productVO.setCategroyType(ss.getCategoryType());

            productVO.setCategroyName(ss.getCategoryName());
            List<ProductInfoVO> productInfoVOList=new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(ss.getCategoryType())) {
                    ProductInfoVO pvo=new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, pvo);
                    productInfoVOList.add(pvo);
                }

            }

        productVO.setProductInfoVO(productInfoVOList);
            productVOList.add(productVO) ;

        }
        r.setData(productVOList);
        return  r;

    }
}
