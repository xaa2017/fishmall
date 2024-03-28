package com.cat.fishmall.nosql.mongodb.repository;

import com.cat.fishmall.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/28
 * @Version: V1.0
 * @Description:
 **/
public interface MemberReadHistoryRepository  extends MongoRepository<MemberReadHistory, String> {
	/**
	 * 根据会员id 按时间倒序获取浏览记录
	 * @param memberId
	 * @return
	 */
	List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long memberId);

	@Query("{'memberId': ?0}")
	List<MemberReadHistory> findByMemberId(Long memberId);
}
