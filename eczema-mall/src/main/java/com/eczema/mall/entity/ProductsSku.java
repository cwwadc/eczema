package com.eczema.mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;

/**
 * 产品sku表
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Data
@TableName("products_sku")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "产品sku表")
public class ProductsSku extends Model<ProductsSku> {
    private static final long serialVersionUID=1L;

    /**
     * PK
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String id;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 最后更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 所属租户
     */
    private String tenantId;
    /**
     * sku编码
     */
    private String skuCode;
    /**
     * 商品Id
     */
    private String spuId;
    /**
     * 图片
     */
    private String picUrl;
    /**
     * 销售价格
     */
    private BigDecimal salesPrice;
    /**
     * 市场价
     */
    private BigDecimal marketPrice;
    /**
     * 成本价
     */
    private BigDecimal costPrice;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * 重量（kg）
     */
    private BigDecimal weight;
    /**
     * 体积（m³）
     */
    private BigDecimal volume;
    /**
     * 是否启用1、是；0否
     */
    private String enable;
    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    private String delFlag;
    /**
     * 视频
     */
    private String vidoUrl;
    /**
     * 3D图片
     */
    private String imagesUrl;

}
