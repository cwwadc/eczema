package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.cloud.util.R;
import com.eczema.mall.entity.SysMenu;
import com.eczema.mall.service.SysMenuService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 菜单权限表
 *
 * @author code generator
 * @date 2020-04-21 15:30:10
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/sysmenu")
@Api(value = "sysmenu", tags = "菜单权限表管理")
public class SysMenuController {

    private final SysMenuService sysMenuService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param sysMenu 菜单权限表
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, SysMenu sysMenu) {
        return R.ok(sysMenuService.page(page, Wrappers.query(sysMenu)));
    }

    /**
     * 菜单权限表查询
     * @param menuId
     * @return R
     */
    @GetMapping("/{menuId}")
    public R getById(@PathVariable("menuId") String menuId) {
        return R.ok(sysMenuService.getById(menuId));
    }

    /**
     * 菜单权限表新增
     * @param sysMenu 菜单权限表
     * @return R
     */
    @PostMapping
    public R save(@RequestBody SysMenu sysMenu) {
        return R.ok(sysMenuService.save(sysMenu));
    }

    /**
     * 菜单权限表修改
     * @param sysMenu 菜单权限表
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody SysMenu sysMenu) {
        return R.ok(sysMenuService.updateById(sysMenu));
    }

    /**
     * 菜单权限表删除
     * @param menuId
     * @return R
     */
    @DeleteMapping("/{menuId}")
    public R removeById(@PathVariable String menuId) {
        return R.ok(sysMenuService.removeById(menuId));
    }

}
