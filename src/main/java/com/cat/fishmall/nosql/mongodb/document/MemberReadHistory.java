package com.cat.fishmall.nosql.mongodb.document;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * 用户商品浏览历史记录
 *
 * @Author: xiaoanan
 * @Date: 2024/3/28
 * @Version: V1.0
 * @Description:
 **/
@Document
@Data
public class MemberReadHistory {
	@Id
	private String id;
	@Indexed
	private Long memberId;
	private String memberNickname;
	private String memberIcon;
	@Indexed
	private Long productId;
	private String productName;
	private String productPic;
	private String productSubTitle;
	private String productPrice;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;
}
