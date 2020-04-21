package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.mall.entity.ProductsSkuSpecValue;
import com.eczema.mall.service.ProductsSkuSpecValueService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 产品sku规格值
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/productsskuspecvalue")
@Api(value = "productsskuspecvalue", tags = "产品sku规格值管理")
public class ProductsSkuSpecValueController {

    private final ProductsSkuSpecValueService productsSkuSpecValueService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param productsSkuSpecValue 产品sku规格值
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, ProductsSkuSpecValue productsSkuSpecValue) {
        return R.ok(productsSkuSpecValueService.page(page, Wrappers.query(productsSkuSpecValue)));
    }

    /**
     * 产品sku规格值查询
     * @param id
     * @return R
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable("id") String id) {
        return R.ok(productsSkuSpecValueService.getById(id));
    }

    /**
     * 产品sku规格值新增
     * @param productsSkuSpecValue 产品sku规格值
     * @return R
     */
    @PostMapping
    public R save(@RequestBody ProductsSkuSpecValue productsSkuSpecValue) {
        return R.ok(productsSkuSpecValueService.save(productsSkuSpecValue));
    }

    /**
     * 产品sku规格值修改
     * @param productsSkuSpecValue 产品sku规格值
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody ProductsSkuSpecValue productsSkuSpecValue) {
        return R.ok(productsSkuSpecValueService.updateById(productsSkuSpecValue));
    }

    /**
     * 产品sku规格值删除
     * @param id
     * @return R
     */
    @DeleteMapping("/{id}")
    public R removeById(@PathVariable String id) {
        return R.ok(productsSkuSpecValueService.removeById(id));
    }

}
