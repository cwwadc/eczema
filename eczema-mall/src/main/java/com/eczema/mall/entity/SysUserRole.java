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
 * 用户和角色关联表
 *
 * @author code generator
 * @date 2020-04-21 15:30:10
 */
@Data
@TableName("sys_user_role")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "用户和角色关联表")
public class SysUserRole extends Model<SysUserRole> {
    private static final long serialVersionUID=1L;

    /**
     * 用户ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String userId;
    /**
     * 角色ID
     */
    private String roleId;

}
