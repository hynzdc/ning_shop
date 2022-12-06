package com.hyn.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 表名：product_category
 * 表注释：类目表
*/
@Data
@TableName(value = "product_category")
public class ProductCategory {
    @TableId(value="category_id", type = IdType.ASSIGN_ID)
    @TableField(value = "category_id")
    private Integer categoryId;

    /**
     * 类目名称
     */
    @TableField(value = "category_name")
    private String categoryName;

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
}