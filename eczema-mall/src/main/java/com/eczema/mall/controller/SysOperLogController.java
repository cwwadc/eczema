package com.eczema.mall.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.eczema.mall.entity.SysOperLog;
import com.eczema.mall.service.SysOperLogService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;

/**
 * 操作日志记录
 *
 * @author code generator
 * @date 2020-04-21 15:30:10
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/sysoperlog")
@Api(value = "sysoperlog", tags = "操作日志记录管理")
public class SysOperLogController {

    private final SysOperLogService sysOperLogService;

    /**
     * 分页列表
     * @param page 分页对象
     * @param sysOperLog 操作日志记录
     * @return
     */
    @GetMapping("/page")
    public R getPage(Page page, SysOperLog sysOperLog) {
        return R.ok(sysOperLogService.page(page, Wrappers.query(sysOperLog)));
    }

    /**
     * 操作日志记录查询
     * @param operId
     * @return R
     */
    @GetMapping("/{operId}")
    public R getById(@PathVariable("operId") String operId) {
        return R.ok(sysOperLogService.getById(operId));
    }

    /**
     * 操作日志记录新增
     * @param sysOperLog 操作日志记录
     * @return R
     */
    @PostMapping
    public R save(@RequestBody SysOperLog sysOperLog) {
        return R.ok(sysOperLogService.save(sysOperLog));
    }

    /**
     * 操作日志记录修改
     * @param sysOperLog 操作日志记录
     * @return R
     */
    @PutMapping
    public R updateById(@RequestBody SysOperLog sysOperLog) {
        return R.ok(sysOperLogService.updateById(sysOperLog));
    }

    /**
     * 操作日志记录删除
     * @param operId
     * @return R
     */
    @DeleteMapping("/{operId}")
    public R removeById(@PathVariable String operId) {
        return R.ok(sysOperLogService.removeById(operId));
    }

}
