package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.mall.entity.ProductsSku;
import com.eczema.mall.service.ProductsSkuService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 产品sku表
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/productssku")
@Api(value = "productssku", tags = "产品sku表管理")
public class ProductsSkuController {

    private final ProductsSkuService productsSkuService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param productsSku 产品sku表
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, ProductsSku productsSku) {
        return R.ok(productsSkuService.page(page, Wrappers.query(productsSku)));
    }

    /**
     * 产品sku表查询
     * @param id
     * @return R
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable("id") String id) {
        return R.ok(productsSkuService.getById(id));
    }

    /**
     * 产品sku表新增
     * @param productsSku 产品sku表
     * @return R
     */
    @PostMapping
    public R save(@RequestBody ProductsSku productsSku) {
        return R.ok(productsSkuService.save(productsSku));
    }

    /**
     * 产品sku表修改
     * @param productsSku 产品sku表
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody ProductsSku productsSku) {
        return R.ok(productsSkuService.updateById(productsSku));
    }

    /**
     * 产品sku表删除
     * @param id
     * @return R
     */
    @DeleteMapping("/{id}")
    public R removeById(@PathVariable String id) {
        return R.ok(productsSkuService.removeById(id));
    }

}
