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
public class SmsFlashPromotionLog implements Serializable {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "")
    private Integer memberId;

    @ApiModelProperty(value = "")
    private Long productId;

    @ApiModelProperty(value = "")
    private String memberPhone;

    @ApiModelProperty(value = "")
    private String productName;

    @ApiModelProperty(value = "会员订阅时间")
    private Date subscribeTime;

    @ApiModelProperty(value = "")
    private Date sendTime;

    private static final long serialVersionUID = 1L;
}