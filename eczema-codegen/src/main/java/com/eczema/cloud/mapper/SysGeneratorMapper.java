package com.eczema.cloud.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface SysGeneratorMapper {

    /**
     * 分页查询表格
     *
     * @param page
     * @param tableName
     * @return
     */
    IPage<List<Map<String, Object>>> selectPage(Page page, @Param("tableName") String tableName);

    /**
     * 分页查询所有
     *
     * @return
     */
    List<Map<String, Object>> queryList();

    /**
     * 查询数据库所有表名
     * @return
     */
    @Select("select table_name tableName from information_schema.tables  where table_schema = (SELECT DATABASE())")
    List<String> queryAllTable();

    /**
     * 查询表信息
     *
     * @param tableName 表名称
     * @return
     */
    Map<String, String> queryTable(String tableName);

    /**
     * 查询表列信息
     *
     * @param tableName 表名称
     * @return
     */
    List<Map<String, String>> queryColumns(String tableName);
}
