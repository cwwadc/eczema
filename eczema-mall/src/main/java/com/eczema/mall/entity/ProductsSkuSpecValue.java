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
 * 产品sku规格值
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Data
@TableName("products_sku_spec_value")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "产品sku规格值")
public class ProductsSkuSpecValue extends Model<ProductsSkuSpecValue> {
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
     * sku_id
     */
    private String skuId;
    /**
     * 规格值id
     */
    private String specValueId;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

}
