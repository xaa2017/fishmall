package com.cat.fishmall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
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
public class SmsHomeRecommendSubject implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long subjectId;

    @ApiModelProperty(value = "")
    private String subjectName;

    @ApiModelProperty(value = "")
    private Integer recommendStatus;

    @ApiModelProperty(value = "")
    private Integer sort;

    private static final long serialVersionUID = 1L;
}