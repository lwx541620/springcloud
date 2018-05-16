package com.imooc.product.enums;

import lombok.Getter;

import javax.persistence.criteria.CriteriaBuilder;
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(1,"商品不存在"),
    PRODUCT_STOCK_NOT_ENOUGN(2,"商品库存不足"),
    ;
    private Integer code;
    private String message;
    ResultEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
