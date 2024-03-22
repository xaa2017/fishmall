package com.cat.fishmall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author white
 * @date 2024/03/22/03:34
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CmsSubject implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long categoryId;

    @ApiModelProperty(value = "")
    private String title;

    @ApiModelProperty(value = "专题主图")
    private String pic;

    @ApiModelProperty(value = "关联产品数量")
    private Integer productCount;

    @ApiModelProperty(value = "")
    private Integer recommendStatus;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private Integer collectCount;

    @ApiModelProperty(value = "")
    private Integer readCount;

    @ApiModelProperty(value = "")
    private Integer commentCount;

    @ApiModelProperty(value = "画册图片用逗号分割")
    private String albumPics;

    @ApiModelProperty(value = "")
    private String description;

    @ApiModelProperty(value = "显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @ApiModelProperty(value = "转发数")
    private Integer forwardCount;

    @ApiModelProperty(value = "专题分类名称")
    private String categoryName;

    @ApiModelProperty(value = "")
    private String content;

    private static final long serialVersionUID = 1L;
}