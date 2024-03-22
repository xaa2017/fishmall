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
public class CmsTopic implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long categoryId;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private Date startTime;

    @ApiModelProperty(value = "")
    private Date endTime;

    @ApiModelProperty(value = "参与人数")
    private Integer attendCount;

    @ApiModelProperty(value = "关注人数")
    private Integer attentionCount;

    @ApiModelProperty(value = "")
    private Integer readCount;

    @ApiModelProperty(value = "奖品名称")
    private String awardName;

    @ApiModelProperty(value = "参与方式")
    private String attendType;

    @ApiModelProperty(value = "话题内容")
    private String content;

    private static final long serialVersionUID = 1L;
}