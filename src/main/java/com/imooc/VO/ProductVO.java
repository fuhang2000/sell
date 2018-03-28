package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private  String  categroyName;
    @JsonProperty("type")
    private  Integer categroyType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVO;

}
