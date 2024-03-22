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
public class PmsAlbum implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "")
    private String coverPic;

    @ApiModelProperty(value = "")
    private Integer picCount;

    @ApiModelProperty(value = "")
    private Integer sort;

    @ApiModelProperty(value = "")
    private String description;

    private static final long serialVersionUID = 1L;
}