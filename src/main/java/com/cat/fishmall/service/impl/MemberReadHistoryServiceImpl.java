package com.cat.fishmall.service.impl;

import com.cat.fishmall.nosql.mongodb.document.MemberReadHistory;
import com.cat.fishmall.service.MemberReadHistoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/28
 * @Version: V1.0
 * @Description:
 **/
@Service
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {
	//@Autowired
	//private MemberReadHistoryRepository readHistoryRepository;

	@Override
	public int create(MemberReadHistory memberReadHistory) {
		memberReadHistory.setId(null);
		memberReadHistory.setCreateTime(new Date());
		//readHistoryRepository.save(memberReadHistory);
		return 1;
	}

	@Override
	public int delete(List<String> ids) {
		List<MemberReadHistory> deleteList = ids.stream().map(id -> {
			MemberReadHistory memberReadHistory = new MemberReadHistory();
			memberReadHistory.setId(id);
			return memberReadHistory;
		}).collect(Collectors.toList());
		//readHistoryRepository.deleteAll(deleteList);
		return ids.size();
	}

	@Override
	public List<MemberReadHistory> list(Long memberId) {
		//return readHistoryRepository.findByMemberId(memberId);
		//return readHistoryRepository.findByMemberIdOrderByCreateTimeDesc(memberId);
		return new ArrayList<>();
	}
}
