package com.cat.fishmall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
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
public class PmsFeightTemplate implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private String name;

    @ApiModelProperty(value = "计费类型:0->按重量；1->按件数")
    private Integer chargeType;

    @ApiModelProperty(value = "首重kg")
    private BigDecimal firstWeight;

    @ApiModelProperty(value = "首费（元）")
    private BigDecimal firstFee;

    @ApiModelProperty(value = "")
    private BigDecimal continueWeight;

    @ApiModelProperty(value = "")
    private BigDecimal continmeFee;

    @ApiModelProperty(value = "目的地（省、市）")
    private String dest;

    private static final long serialVersionUID = 1L;
}