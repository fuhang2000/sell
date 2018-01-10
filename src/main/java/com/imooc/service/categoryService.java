package com.imooc.service;

        import com.imooc.dataobjdect.ProductCategory;
        import org.aspectj.apache.bcel.generic.RET;

        import java.util.List;

/**
 * Created by Administrator on 2018/1/5.
 * 类目
 */
public  interface CategoryService {
    /*查询*/
    public ProductCategory findOne(Integer categoryId) throws Exception;
    /*查询所有*/
    public List<ProductCategory> findAll()throws Exception;
    /*查询集合中的类目*/
    public  List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryIdlist)throws Exception;

    public ProductCategory  save(ProductCategory productCategory)throws Exception;
}
