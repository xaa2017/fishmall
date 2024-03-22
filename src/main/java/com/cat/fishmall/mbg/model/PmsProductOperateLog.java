package com.cat.fishmall.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
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
public class PmsProductOperateLog implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long productId;

    @ApiModelProperty(value = "")
    private BigDecimal priceOld;

    @ApiModelProperty(value = "")
    private BigDecimal priceNew;

    @ApiModelProperty(value = "")
    private BigDecimal salePriceOld;

    @ApiModelProperty(value = "")
    private BigDecimal salePriceNew;

    @ApiModelProperty(value = "赠送的积分")
    private Integer giftPointOld;

    @ApiModelProperty(value = "")
    private Integer giftPointNew;

    @ApiModelProperty(value = "")
    private Integer usePointLimitOld;

    @ApiModelProperty(value = "")
    private Integer usePointLimitNew;

    @ApiModelProperty(value = "操作人")
    private String operateMan;

    @ApiModelProperty(value = "")
    private Date createTime;

    private static final long serialVersionUID = 1L;
}