package com.hyn.controller;

import com.hyn.entity.ProductInfo;
import com.hyn.service.ProductInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.example.base.ConResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hyn
 * @version 1.0.0
 * @description 产品控制器
 * @date 2022/12/5
 */
@RestController
@RequestMapping("/api")
@Api(tags = "产品管理")
public class ProductController {
    @Resource
    private ProductInfoService productService;
    @GetMapping("/getProductList")
    @ApiOperation("获取所有商品信息列表")
    public ConResult<List<ProductInfo>> getProductList(){
        return ConResult.success(productService.list());
    }
}
