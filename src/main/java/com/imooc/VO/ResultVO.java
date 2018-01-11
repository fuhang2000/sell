package com.imooc.VO;

import lombok.Data;

/**http返回最外层对象
 * Created by Administrator on 2018/1/11.
 */
@Data
public class ResultVO<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 对象
     */
    private T Data;

}
