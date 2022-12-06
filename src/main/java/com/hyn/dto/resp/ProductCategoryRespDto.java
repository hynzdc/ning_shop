package com.hyn.dto.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
import lombok.Data;

import java.util.List;

/**
 * @author hyn
 * @version 1.0.0
 * @description 商品类别返回参数实体类
 * @date 2022/12/6
 */
@Data
@ApiModel("商品类别返回参数实体类")
public class ProductCategoryRespDto {
    @ApiModelProperty(value = "类别名称")
    private String name;
    @ApiModelProperty(value = "类别编号")
    private Integer type;
    @ApiModelProperty(value = "该类别的所有商品")
    private List<ProductRespDto> goods;
}
