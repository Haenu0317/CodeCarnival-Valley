package com.haenu.subject.application.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 题目分类
 * @TableName subject_category
 */
@TableName(value ="subject_category")
@Data
public class  SubjectCategoryDTO implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 分类名称
     */
    @TableField(value = "category_name")
    private String categoryName;

    /**
     * 分类类型
     */
    @TableField(value = "category_type")
    private Integer categoryType;

    /**
     * 图标连接
     */
    @TableField(value = "image_url")
    private String imageUrl;

    /**
     * 父级id
     */
    @TableField(value = "parent_id")
    private Long parentId;

    /**
     * 创建人
     */
    @TableField(value = "created_by")
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private Date createdTime;

    /**
     * 更新人
     */
    @TableField(value = "update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 是否删除 0: 未删除 1: 已删除
     */
    @TableField(value = "is_deleted")
    private Integer isDeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}