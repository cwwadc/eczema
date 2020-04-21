package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.mall.entity.ProductsSpec;
import com.eczema.mall.service.ProductsSpecService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 产品规格表
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/productsspec")
@Api(value = "productsspec", tags = "产品规格表管理")
public class ProductsSpecController {

    private final ProductsSpecService productsSpecService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param productsSpec 产品规格表
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, ProductsSpec productsSpec) {
        return R.ok(productsSpecService.page(page, Wrappers.query(productsSpec)));
    }

    /**
     * 产品规格表查询
     * @param id
     * @return R
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable("id") String id) {
        return R.ok(productsSpecService.getById(id));
    }

    /**
     * 产品规格表新增
     * @param productsSpec 产品规格表
     * @return R
     */
    @PostMapping
    public R save(@RequestBody ProductsSpec productsSpec) {
        return R.ok(productsSpecService.save(productsSpec));
    }

    /**
     * 产品规格表修改
     * @param productsSpec 产品规格表
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody ProductsSpec productsSpec) {
        return R.ok(productsSpecService.updateById(productsSpec));
    }

    /**
     * 产品规格表删除
     * @param id
     * @return R
     */
    @DeleteMapping("/{id}")
    public R removeById(@PathVariable String id) {
        return R.ok(productsSpecService.removeById(id));
    }

}
