package com.hyn.controller;

import com.hyn.dto.resp.ProductCategoryRespDto;
import com.hyn.entity.ProductInfo;
import com.hyn.service.ProductInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.example.base.ConResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author hyn
 * @version 1.0.0
 * @description 产品控制器
 * @date 2022/12/5
 */
@RestController
@RequestMapping("/buyer/project")
@Api(tags = "产品管理")
public class ProductController {
    @Resource
    private ProductInfoService productService;
    @GetMapping("/list")
    @ApiOperation("获取所有的商品分类信息列表")
    public  ConResult<List<ProductCategoryRespDto>> list(){
        return ConResult.success(productService.getAllProductCategoryList());
    }
    @GetMapping("findPriceById/{productId}")
    @ApiOperation("通过id获取商品的价格")
    public ConResult<BigDecimal> findPriceById(@PathVariable("productId") Integer productId){
        return ConResult.success(productService.findPriceById(productId));
    }
    @GetMapping("/findById/{productId}")
    @ApiOperation("根据ID获取商品信息")
    public ConResult<ProductInfo> findById(@PathVariable("productId") Integer productId){
        return ConResult.success(productService.findById(productId));
    }

    @PutMapping("/subStockById/{id}/{quantity}")
    @ApiOperation("减库存")
    public ConResult<Boolean> subStockById(@PathVariable("id") Integer id,@PathVariable("quantity") Integer quantity){
        return  ConResult.success(productService.subStockById(id,quantity));
    }

}
