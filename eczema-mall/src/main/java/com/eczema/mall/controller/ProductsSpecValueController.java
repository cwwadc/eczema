package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.mall.entity.ProductsSpecValue;
import com.eczema.mall.service.ProductsSpecValueService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 产品规格值表
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/productsspecvalue")
@Api(value = "productsspecvalue", tags = "产品规格值表管理")
public class ProductsSpecValueController {

    private final ProductsSpecValueService productsSpecValueService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param productsSpecValue 产品规格值表
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, ProductsSpecValue productsSpecValue) {
        return R.ok(productsSpecValueService.page(page, Wrappers.query(productsSpecValue)));
    }

    /**
     * 产品规格值表查询
     * @param id
     * @return R
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable("id") String id) {
        return R.ok(productsSpecValueService.getById(id));
    }

    /**
     * 产品规格值表新增
     * @param productsSpecValue 产品规格值表
     * @return R
     */
    @PostMapping
    public R save(@RequestBody ProductsSpecValue productsSpecValue) {
        return R.ok(productsSpecValueService.save(productsSpecValue));
    }

    /**
     * 产品规格值表修改
     * @param productsSpecValue 产品规格值表
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody ProductsSpecValue productsSpecValue) {
        return R.ok(productsSpecValueService.updateById(productsSpecValue));
    }

    /**
     * 产品规格值表删除
     * @param id
     * @return R
     */
    @DeleteMapping("/{id}")
    public R removeById(@PathVariable String id) {
        return R.ok(productsSpecValueService.removeById(id));
    }

}
