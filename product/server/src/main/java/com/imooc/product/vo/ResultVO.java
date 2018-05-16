package com.imooc.product.vo;

import lombok.Data;

@Data
public class ResultVO<T> {
    /** 返回的错误编码,0代表成功*/
    private Integer coe;
    /** 返回的提示信息*/
    private String msg;
    /** 返回的具体内容*/
    private T data;

}
