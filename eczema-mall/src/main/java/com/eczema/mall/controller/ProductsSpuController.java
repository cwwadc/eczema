package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.mall.entity.ProductsSku;
import com.eczema.mall.entity.ProductsSpu;
import com.eczema.mall.service.ProductsSkuService;
import com.eczema.mall.service.ProductsSpuService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 产品spu表
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/productsspu")
@Api(value = "productsspu", tags = "产品spu表管理")
public class ProductsSpuController {

    private final ProductsSpuService productsSpuService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param productsSpu 产品spu表
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, ProductsSpu productsSpu) {
        return R.ok(productsSpuService.page(page, Wrappers.query(productsSpu)));
    }

    /**
     * 产品spu表查询
     * @param id
     * @return R
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable("id") String id) {
        return R.ok(productsSpuService.getById(id));
    }

    /**
     * 产品spu表新增
     * @param productsSpu 产品spu表
     * @return R
     */
    @PostMapping
    public R save(@RequestBody ProductsSpu productsSpu) {
        return R.ok(productsSpuService.save(productsSpu));
    }

    /**
     * 产品spu表修改
     * @param productsSpu 产品spu表
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody ProductsSpu productsSpu) {
        return R.ok(productsSpuService.updateById(productsSpu));
    }

    /**
     * 产品spu表删除
     * @param id
     * @return R
     */
    @DeleteMapping("/{id}")
    public R removeById(@PathVariable String id) {
        return R.ok(productsSpuService.removeById(id));
    }

}
