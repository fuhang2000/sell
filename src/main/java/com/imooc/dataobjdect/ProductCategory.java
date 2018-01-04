package com.imooc.dataobjdect;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 */
@Entity //实体
public class ProductCategory {

    @Override
    public String toString() {
        return "ProductCategory{" +
                "CategoryId=" + CategoryId +
                ", CategoryName='" + CategoryName + '\'' +
                ", CategoryType=" + CategoryType +
                '}';
    }

    /**类目 id */
    @Id  //标明主键
    @GeneratedValue  //策略
    private  Integer CategoryId;
    /**类目名字 */
    private  String  CategoryName;

    /**类目 编号 */
    private Integer CategoryType;

    private Date createTime;

    private Date updateTime;

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public Integer getCategoryType() {
        return CategoryType;
    }

    public void setCategoryType(Integer categoryType) {
        CategoryType = categoryType;
    }
}
