package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.cloud.util.R;
import com.eczema.mall.entity.SysUser;
import com.eczema.mall.service.SysUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 用户信息表
 *
 * @author code generator
 * @date 2020-04-21 15:30:10
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/sysuser")
@Api(value = "sysuser", tags = "用户信息表管理")
public class SysUserController {

    private final SysUserService sysUserService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param sysUser 用户信息表
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, SysUser sysUser) {
        return R.ok(sysUserService.page(page, Wrappers.query(sysUser)));
    }

    /**
     * 用户信息表查询
     * @param userId
     * @return R
     */
    @GetMapping("/{userId}")
    public R getById(@PathVariable("userId") String userId) {
        return R.ok(sysUserService.getById(userId));
    }

    /**
     * 用户信息表新增
     * @param sysUser 用户信息表
     * @return R
     */
    @PostMapping
    public R save(@RequestBody SysUser sysUser) {
        return R.ok(sysUserService.save(sysUser));
    }

    /**
     * 用户信息表修改
     * @param sysUser 用户信息表
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody SysUser sysUser) {
        return R.ok(sysUserService.updateById(sysUser));
    }

    /**
     * 用户信息表删除
     * @param userId
     * @return R
     */
    @DeleteMapping("/{userId}")
    public R removeById(@PathVariable String userId) {
        return R.ok(sysUserService.removeById(userId));
    }

}
