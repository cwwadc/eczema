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
 * 产品spu规格表
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Data
@TableName("products_spu_spec")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "产品spu规格表")
public class ProductsSpuSpec extends Model<ProductsSpuSpec> {
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
     * spu_id
     */
    private String spuId;
    /**
     * spec_id
     */
    private String specId;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}
