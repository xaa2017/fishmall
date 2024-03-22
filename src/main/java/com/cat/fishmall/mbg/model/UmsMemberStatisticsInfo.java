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
public class UmsMemberStatisticsInfo implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long memberId;

    @ApiModelProperty(value = "累计消费金额")
    private BigDecimal consumeAmount;

    @ApiModelProperty(value = "订单数量")
    private Integer orderCount;

    @ApiModelProperty(value = "优惠券数量")
    private Integer couponCount;

    @ApiModelProperty(value = "评价数")
    private Integer commentCount;

    @ApiModelProperty(value = "退货数量")
    private Integer returnOrderCount;

    @ApiModelProperty(value = "登录次数")
    private Integer loginCount;

    @ApiModelProperty(value = "关注数量")
    private Integer attendCount;

    @ApiModelProperty(value = "粉丝数量")
    private Integer fansCount;

    @ApiModelProperty(value = "")
    private Integer collectProductCount;

    @ApiModelProperty(value = "")
    private Integer collectSubjectCount;

    @ApiModelProperty(value = "")
    private Integer collectTopicCount;

    @ApiModelProperty(value = "")
    private Integer collectCommentCount;

    @ApiModelProperty(value = "")
    private Integer inviteFriendCount;

    @ApiModelProperty(value = "最后一次下订单时间")
    private Date recentOrderTime;

    private static final long serialVersionUID = 1L;
}