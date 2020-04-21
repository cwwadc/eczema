package com.eczema.cloud.service.impl;

import cn.hutool.core.io.IoUtil;
import com.eczema.cloud.entity.GenConfig;
import com.eczema.cloud.mapper.SysGeneratorMapper;
import com.eczema.cloud.service.SysGeneratorService;
import com.eczema.cloud.util.GenUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

@Service
@AllArgsConstructor
public class SysGeneratorServiceImpl implements SysGeneratorService {

    private final SysGeneratorMapper sysGeneratorMapper;


    @Override
    public byte[] generatorCode(GenConfig genConfig) {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(outputStream);
        //查询表信息
        Map<String, String> table = queryTable(genConfig.getTableName());
        //查询列信息
        List<Map<String, String>> columns = queryColumns(genConfig.getTableName());
        //生成代码
        GenUtils.generatorCode(genConfig, table, columns, zip);
        IoUtil.close(zip);
        return outputStream.toByteArray();
    }

    private List<Map<String, Object>> queryList(){
        return sysGeneratorMapper.queryList();
    }

    private Map<String, String> queryTable(String tableName) {
        return sysGeneratorMapper.queryTable(tableName);
    }

    private List<Map<String, String>> queryColumns(String tableName) {
        return sysGeneratorMapper.queryColumns(tableName);
    }
}
