package com.cat.fishmall.service;

import com.cat.fishmall.dto.OssCallbackResult;
import com.cat.fishmall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 肖安安
 */
public interface OssService {

	/**
	 * OSS 上传策略生成
	 * @return
	 */
	OssPolicyResult policy();

	/**
	 * OSS 上传成功回调
	 * @param request
	 * @return
	 */
	OssCallbackResult callback(HttpServletRequest request);
}
