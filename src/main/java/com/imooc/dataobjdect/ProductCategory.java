package com.imooc.dataobjdect;




import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 */
@Entity //实体
@DynamicUpdate//动态生成更新
@Data//包含 get set  toString
public class ProductCategory {


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


}
