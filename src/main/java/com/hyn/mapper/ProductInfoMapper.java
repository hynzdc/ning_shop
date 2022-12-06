package com.hyn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hyn.dto.resp.ProductCategoryRespDto;
import com.hyn.entity.ProductInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductInfoMapper extends BaseMapper<ProductInfo> {
    List<ProductCategoryRespDto> getAllProductCategoryList();
}