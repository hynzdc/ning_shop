package com.hyn.enums;

/**
 * @author hyn
 * @version 1.0.0
 * @description
 * @date 2022/12/6
 */
public enum ProductExceptionEnum {
    PRODUCT_STOCK_LACK(101,"该商品的库存不足")
    ;
    private Integer code;
    private String msg;

    ProductExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
