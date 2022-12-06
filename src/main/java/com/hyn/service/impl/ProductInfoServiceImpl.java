/**
* @mbg.generated
* generator on Mon Dec 05 20:19:19 CST 2022
*/
package com.hyn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyn.dto.resp.ProductCategoryRespDto;
import com.hyn.entity.ProductInfo;
import com.hyn.enums.ProductExceptionEnum;
import com.hyn.mapper.ProductInfoMapper;
import com.hyn.service.ProductInfoService;
import org.example.exception.BusinessException;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoMapper, ProductInfo> implements ProductInfoService {
    @Override
    public List<ProductCategoryRespDto> getAllProductCategoryList() {
        return this.baseMapper.getAllProductCategoryList();
    }

    @Override
    public BigDecimal findPriceById(Integer productId) {
        return this.lambdaQuery()
                .select(ProductInfo::getProductPrice)
                .eq(ProductInfo::getProductId, productId)
                .one()
                .getProductPrice();
    }

    @Override
    public ProductInfo findById(Integer productId) {
        return this.lambdaQuery().eq(ProductInfo::getProductId,productId).one();
    }

    @Override
    public synchronized Boolean subStockById(Integer id, Integer quantity) {
        //查询出现在的库存
        Integer productStock = this.lambdaQuery().select(ProductInfo::getProductStock).eq(ProductInfo::getProductId, id).one().getProductStock();
        if (productStock.compareTo(quantity) < 0) {
            //throw new BusinessException(ProductExceptionEnum.PRODUCT_STOCK_LACK.getCode(),ProductExceptionEnum.PRODUCT_STOCK_LACK.getMsg());
            throw new BusinessException(ProductExceptionEnum.PRODUCT_STOCK_LACK.getCode(), ProductExceptionEnum.PRODUCT_STOCK_LACK.getMsg());
        }
        //扣减完的数量
        Integer updateStock = productStock - quantity;
        //扣减库存数据库
        return this.lambdaUpdate().eq(ProductInfo::getProductId, id).set(ProductInfo::getProductStock, updateStock).update();
    }
}