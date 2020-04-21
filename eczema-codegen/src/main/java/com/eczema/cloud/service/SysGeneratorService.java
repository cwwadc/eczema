package com.eczema.cloud.service;

import com.eczema.cloud.entity.GenConfig;

public interface SysGeneratorService {

    /**
     * 生成代码
     *
     * @param genConfig 生成配置
     * @return
     */
    byte[] generatorCode(GenConfig genConfig);
}
