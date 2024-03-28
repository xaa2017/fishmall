package com.cat.fishmall.service;

import com.cat.fishmall.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * 会员记录浏览管理 service
 * @Author: xiaoanan
 * @Date: 2024/3/28
 * @Version: V1.0
 * @Description:
 **/
public interface MemberReadHistoryService {
	/**
	 * 生成浏览记录
	 */
	int create(MemberReadHistory memberReadHistory);

	/**
	 * 批量删除浏览记录
	 */
	int delete(List<String> ids);

	/**
	 * 获取用户浏览历史记录
	 */
	List<MemberReadHistory> list(Long memberId);
}
