package com.eczema.cloud.util;

import cn.hutool.core.io.IoUtil;
import com.eczema.cloud.entity.GenConfig;
import com.eczema.cloud.mapper.SysGeneratorMapper;
import lombok.AllArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipOutputStream;

@Component
@AllArgsConstructor
public class GenComp {

    private final SysGeneratorMapper sysGeneratorMapper;

    /**
     * 生成所有表
     * @return
     */
    public byte[] generatorCode() {
//        List<String> tableNames=sysGeneratorMapper.queryAllTable();
//        return generatorCode(tableNames);
        List<Map<String, Object>> maps = queryList();
        return generatorCode2(maps);
    }

    /**
     * 生成指定表
     * @param tableNames
     * @return
     */
    public byte[] generatorCode(List<String> tableNames) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(outputStream);
        for (String tableName : tableNames) {
            //查询表信息
            Map<String, String> table = sysGeneratorMapper.queryTable(tableName);
            //查询列信息
            List<Map<String, String>> columns =sysGeneratorMapper.queryColumns(tableName);
            GenUtils.generatorCode2( table, columns, zip);
        }
        IOUtils.closeQuietly(zip);
        return outputStream.toByteArray();
    }

    /**
     * 生成指定表
     * @param maps
     * @return
     */
    public byte[] generatorCode2(List<Map<String, Object>> maps) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(outputStream);
        for (Map<String, Object> map : maps) {
            String tableName = map.get("tableName").toString();
            //查询表信息
            Map<String, String> table = sysGeneratorMapper.queryTable(tableName);
            //查询列信息
            List<Map<String, String>> columns =sysGeneratorMapper.queryColumns(tableName);
            GenConfig config = new GenConfig();
            config.setTableName(map.get("tableName").toString());
            config.setComments(map.get("tableComment").toString());
            GenUtils.generatorCode(config, table, columns, zip);
        }
        IOUtils.closeQuietly(zip);
        return outputStream.toByteArray();
    }


    private List<Map<String, Object>> queryList(){
        return sysGeneratorMapper.queryList();
    }

}
