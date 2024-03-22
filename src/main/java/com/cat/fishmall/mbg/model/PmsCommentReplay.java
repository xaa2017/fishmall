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
public class PmsCommentReplay implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long commentId;

    @ApiModelProperty(value = "")
    private String memberNickName;

    @ApiModelProperty(value = "")
    private String memberIcon;

    @ApiModelProperty(value = "")
    private String content;

    @ApiModelProperty(value = "")
    private Date createTime;

    @ApiModelProperty(value = "评论人员类型；0->会员；1->管理员")
    private Integer type;

    private static final long serialVersionUID = 1L;
}