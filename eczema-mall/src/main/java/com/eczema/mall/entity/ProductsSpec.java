package com.eczema.mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
    import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;

/**
 * 产品规格表
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Data
@TableName("products_spec")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "产品规格表")
public class ProductsSpec extends Model<ProductsSpec> {
    private static final long serialVersionUID=1L;

    /**
     * PK
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 所属租户
     */
    private String tenantId;
    /**
     * 名称
     */
    private String name;
    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    private String delFlag;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 最后更新时间
     */
    private LocalDateTime updateTime;

}
