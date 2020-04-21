package com.eczema.cloud.controller;

import cn.hutool.core.io.IoUtil;
import com.eczema.cloud.entity.GenConfig;
import com.eczema.cloud.service.SysGeneratorService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@AllArgsConstructor
@RestController
@RequestMapping("/generator")
public class SysGeneratorController {

    private final SysGeneratorService sysGeneratorService;

    /**
     * 生成代码
     */
    @SneakyThrows
    @PostMapping("/code")
    public void generatorCode(HttpServletResponse response) {
        GenConfig genConfig = new GenConfig();
        genConfig.setTableName("products_spu");
        genConfig.setAuthor("cww");
        byte[] data = sysGeneratorService.generatorCode(genConfig);
        response.reset();
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, String.format("attachment; filename=%s.zip", genConfig.getTableName()));
        response.addHeader(HttpHeaders.CONTENT_LENGTH, String.valueOf(data.length));
        response.setContentType("application/octet-stream; charset=UTF-8");

        IoUtil.write(response.getOutputStream(), Boolean.TRUE, data);
    }
}
