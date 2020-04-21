package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.cloud.util.R;
import com.eczema.mall.entity.SysUserRole;
import com.eczema.mall.service.SysUserRoleService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 用户和角色关联表
 *
 * @author code generator
 * @date 2020-04-21 15:30:10
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/sysuserrole")
@Api(value = "sysuserrole", tags = "用户和角色关联表管理")
public class SysUserRoleController {

    private final SysUserRoleService sysUserRoleService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param sysUserRole 用户和角色关联表
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, SysUserRole sysUserRole) {
        return R.ok(sysUserRoleService.page(page, Wrappers.query(sysUserRole)));
    }

    /**
     * 用户和角色关联表查询
     * @param userId
     * @return R
     */
    @GetMapping("/{userId}")
    public R getById(@PathVariable("userId") String userId) {
        return R.ok(sysUserRoleService.getById(userId));
    }

    /**
     * 用户和角色关联表新增
     * @param sysUserRole 用户和角色关联表
     * @return R
     */
    @PostMapping
    public R save(@RequestBody SysUserRole sysUserRole) {
        return R.ok(sysUserRoleService.save(sysUserRole));
    }

    /**
     * 用户和角色关联表修改
     * @param sysUserRole 用户和角色关联表
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody SysUserRole sysUserRole) {
        return R.ok(sysUserRoleService.updateById(sysUserRole));
    }

    /**
     * 用户和角色关联表删除
     * @param userId
     * @return R
     */
    @DeleteMapping("/{userId}")
    public R removeById(@PathVariable String userId) {
        return R.ok(sysUserRoleService.removeById(userId));
    }

}
