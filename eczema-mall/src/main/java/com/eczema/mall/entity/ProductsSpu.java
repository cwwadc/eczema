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
 * 产品spu表
 *
 * @author code generator
 * @date 2020-04-21 11:04:12
 */
@Data
@TableName("products_spu")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "产品spu表")
public class ProductsSpu extends Model<ProductsSpu> {
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
     * spu编码
     */
    private String spuCode;
    /**
     * spu名字
     */
    private String name;
    /**
     * 卖点
     */
    private String sellPoint;
    /**
     * 描述
     */
    private String description;
    /**
     * 一级分类ID
     */
    private String categoryFirst;
    /**
     * 二级分类ID
     */
    private String categorySecond;
    /**
     * 商品图片
     */
    private String picUrls;
    /**
     * 是否上架（1是 0否）
     */
    private String shelf;
    /**
     * 排序字段
     */
    private Integer sort;
    /**
     * 最低价
     */
    private BigDecimal priceDown;
    /**
     * 最高价
     */
    private BigDecimal priceUp;
    /**
     * 销量
     */
    private Integer saleNum;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 最后更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 0统一规格；1多规格
     */
    private String specType;
    /**
     * 逻辑删除标记（0：显示；1：隐藏）
     */
    private String delFlag;
    /**
     * 积分赠送开关（1开 0关）
     */
    private String pointsGiveSwitch;
    /**
     * 积分赠送数量
     */
    private Integer pointsGiveNum;
    /**
     * 积分抵扣开关（1开 0关）
     */
    private String pointsDeductSwitch;
    /**
     * 积分抵扣商品金额比例（0~100）
     */
    private Integer pointsDeductScale;
    /**
     * 1积分数可抵多少元
     */
    private BigDecimal pointsDeductAmount;
    /**
     * 运费模板ID
     */
    private String freightTemplatId;
    /**
     * 发货地ID
     */
    private String deliveryPlaceId;
    /**
     * 工厂Id
     */
    private String factoryId;
    /**
     * 工厂名称
     */
    private String factoryName;
    /**
     * 视频
     */
    private String vidoUrls;
    /**
     * 3D图片
     */
    private String imagesUrls;

}
