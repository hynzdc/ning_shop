package com.hyn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 表名：product_info
 * 表注释：商品表
*/
@Data
@TableName(value = "product_info")
public class ProductInfo {
    @TableId(value="product_id", type = IdType.ASSIGN_ID)
    @TableField(value = "product_id")
    private Integer productId;

    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    private String productName;

    /**
     * 商品单价
     */
    @TableField(value = "product_price")
    private BigDecimal productPrice;

    /**
     * 库存
     */
    @TableField(value = "product_stock")
    private Integer productStock;

    /**
     * 描述
     */
    @TableField(value = "product_description")
    private String productDescription;

    /**
     * 小图
     */
    @TableField(value = "product_icon")
    private String productIcon;

    /**
     * 类目编号
     */
    @TableField(value = "category_type")
    private Integer categoryType;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 商品状态，1正常0下架
     */
    @TableField(value = "product_status")
    private Integer productStatus;
}