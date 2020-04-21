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
 * 角色和菜单关联表
 *
 * @author code generator
 * @date 2020-04-21 15:30:10
 */
@Data
@TableName("sys_role_menu")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "角色和菜单关联表")
public class SysRoleMenu extends Model<SysRoleMenu> {
    private static final long serialVersionUID=1L;

    /**
     * 角色ID
     */
    @TableId(type = IdType.ASSIGN_ID)
    private String roleId;
    /**
     * 菜单ID
     */
    private String menuId;

}
