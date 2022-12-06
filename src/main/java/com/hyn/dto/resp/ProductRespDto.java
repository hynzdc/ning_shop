package com.hyn.dto.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author hyn
 * @version 1.0.0
 * @description 商品信息返回参数
 * @date 2022/12/6
 */
@Data
@ApiModel("商品信息返回参数")
public class ProductRespDto {
    @ApiModelProperty(value = "商品id")
    private Integer id;
    @ApiModelProperty(value = "商品名称")
    private String name;
    @ApiModelProperty(value = "商品价格")
    private BigDecimal price;
    @ApiModelProperty(value = "商品描述")
    private String description;
    @ApiModelProperty("商品图标")
    private String icon;
    @ApiModelProperty("商品数量")
    private Integer quantity = 0;
    @ApiModelProperty("商品库存")
    private Integer stock;
}
