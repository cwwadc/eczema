package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.cloud.util.R;
import com.eczema.mall.entity.SysRole;
import com.eczema.mall.service.SysRoleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 角色信息表
 *
 * @author code generator
 * @date 2020-04-21 15:30:10
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/sysrole")
@Api(value = "sysrole", tags = "角色信息表管理")
public class SysRoleController {

    private final SysRoleService sysRoleService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param sysRole 角色信息表
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, SysRole sysRole) {
        return R.ok(sysRoleService.page(page, Wrappers.query(sysRole)));
    }

    /**
     * 角色信息表查询
     * @param roleId
     * @return R
     */
    @GetMapping("/{roleId}")
    public R getById(@PathVariable("roleId") String roleId) {
        return R.ok(sysRoleService.getById(roleId));
    }

    /**
     * 角色信息表新增
     * @param sysRole 角色信息表
     * @return R
     */
    @PostMapping
    public R save(@RequestBody SysRole sysRole) {
        return R.ok(sysRoleService.save(sysRole));
    }

    /**
     * 角色信息表修改
     * @param sysRole 角色信息表
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody SysRole sysRole) {
        return R.ok(sysRoleService.updateById(sysRole));
    }

    /**
     * 角色信息表删除
     * @param roleId
     * @return R
     */
    @DeleteMapping("/{roleId}")
    public R removeById(@PathVariable String roleId) {
        return R.ok(sysRoleService.removeById(roleId));
    }

}
