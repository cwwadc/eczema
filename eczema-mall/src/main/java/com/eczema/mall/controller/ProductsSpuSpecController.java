package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.mall.entity.ProductsSpuSpec;
import com.eczema.mall.service.ProductsSpuSpecService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 产品spu规格表
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/productsspuspec")
@Api(value = "productsspuspec", tags = "产品spu规格表管理")
public class ProductsSpuSpecController {

    private final ProductsSpuSpecService productsSpuSpecService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param productsSpuSpec 产品spu规格表
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, ProductsSpuSpec productsSpuSpec) {
        return R.ok(productsSpuSpecService.page(page, Wrappers.query(productsSpuSpec)));
    }

    /**
     * 产品spu规格表查询
     * @param id
     * @return R
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable("id") String id) {
        return R.ok(productsSpuSpecService.getById(id));
    }

    /**
     * 产品spu规格表新增
     * @param productsSpuSpec 产品spu规格表
     * @return R
     */
    @PostMapping
    public R save(@RequestBody ProductsSpuSpec productsSpuSpec) {
        return R.ok(productsSpuSpecService.save(productsSpuSpec));
    }

    /**
     * 产品spu规格表修改
     * @param productsSpuSpec 产品spu规格表
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody ProductsSpuSpec productsSpuSpec) {
        return R.ok(productsSpuSpecService.updateById(productsSpuSpec));
    }

    /**
     * 产品spu规格表删除
     * @param id
     * @return R
     */
    @DeleteMapping("/{id}")
    public R removeById(@PathVariable String id) {
        return R.ok(productsSpuSpecService.removeById(id));
    }

}
