package com.cat.fishmall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**oss上传文件的回调结果
 * @Author: xiaoanan
 * @Date: 2024/4/3
 * @Version: V1.0
 * @Description:
 **/
@Getter
@Setter
public class OssCallbackResult {

	@ApiModelProperty("文件名称")
	private String filename;

	@ApiModelProperty("文件大小")
	private String size;

	@ApiModelProperty("文件的mimeType")
	private String mimeType;

	@ApiModelProperty("图片文件的宽")
	private String width;

	@ApiModelProperty("图片文件的高")
	private String height;
}
