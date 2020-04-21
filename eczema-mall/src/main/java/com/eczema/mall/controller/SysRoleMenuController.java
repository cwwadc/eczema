package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.cloud.util.R;
import com.eczema.mall.entity.SysRoleMenu;
import com.eczema.mall.service.SysRoleMenuService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 角色和菜单关联表
 *
 * @author code generator
 * @date 2020-04-21 15:30:10
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/sysrolemenu")
@Api(value = "sysrolemenu", tags = "角色和菜单关联表管理")
public class SysRoleMenuController {

    private final SysRoleMenuService sysRoleMenuService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param sysRoleMenu 角色和菜单关联表
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, SysRoleMenu sysRoleMenu) {
        return R.ok(sysRoleMenuService.page(page, Wrappers.query(sysRoleMenu)));
    }

    /**
     * 角色和菜单关联表查询
     * @param roleId
     * @return R
     */
    @GetMapping("/{roleId}")
    public R getById(@PathVariable("roleId") String roleId) {
        return R.ok(sysRoleMenuService.getById(roleId));
    }

    /**
     * 角色和菜单关联表新增
     * @param sysRoleMenu 角色和菜单关联表
     * @return R
     */
    @PostMapping
    public R save(@RequestBody SysRoleMenu sysRoleMenu) {
        return R.ok(sysRoleMenuService.save(sysRoleMenu));
    }

    /**
     * 角色和菜单关联表修改
     * @param sysRoleMenu 角色和菜单关联表
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody SysRoleMenu sysRoleMenu) {
        return R.ok(sysRoleMenuService.updateById(sysRoleMenu));
    }

    /**
     * 角色和菜单关联表删除
     * @param roleId
     * @return R
     */
    @DeleteMapping("/{roleId}")
    public R removeById(@PathVariable String roleId) {
        return R.ok(sysRoleMenuService.removeById(roleId));
    }

}
