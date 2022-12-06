package com.hyn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hyn.entity.ProductInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductInfoMapper extends BaseMapper<ProductInfo> {
}