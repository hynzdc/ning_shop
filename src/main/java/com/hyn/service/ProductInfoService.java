/**
* @mbg.generated
* generator on Mon Dec 05 20:19:19 CST 2022
*/
package com.hyn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hyn.dto.resp.ProductCategoryRespDto;
import com.hyn.entity.ProductInfo;

import java.math.BigDecimal;
import java.util.List;

public interface ProductInfoService extends IService<ProductInfo> {
    List<ProductCategoryRespDto> getAllProductCategoryList();

    BigDecimal findPriceById(Integer productId);

    ProductInfo findById(Integer productId);

    Boolean subStockById(Integer id, Integer quantity);
}