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
public class UmsMemberReceiveAddress implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long memberId;

    @ApiModelProperty(value = "收货人名称")
    private String name;

    @ApiModelProperty(value = "")
    private String phoneNumber;

    @ApiModelProperty(value = "是否为默认")
    private Integer defaultStatus;

    @ApiModelProperty(value = "邮政编码")
    private String postCode;

    @ApiModelProperty(value = "省份/直辖市")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "区")
    private String region;

    @ApiModelProperty(value = "详细地址(街道)")
    private String detailAddress;

    private static final long serialVersionUID = 1L;
}