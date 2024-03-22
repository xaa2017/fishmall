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
public class CmsHelp implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long categoryId;

    @ApiModelProperty(value = "")
    private String icon;

    @ApiModelProperty(value = "")
    private String title;

    @ApiModelProperty(value = "")
    private Integer showStatus;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "")
    private Integer readCount;

    @ApiModelProperty(value = "")
    private String content;

    private static final long serialVersionUID = 1L;
}