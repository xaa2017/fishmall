package com.cat.fishmall.controller;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/28
 * @Version: V1.0
 * @Description:
 **/

import com.cat.fishmall.common.api.CommonResult;
import com.cat.fishmall.nosql.mongodb.document.MemberReadHistory;
import com.cat.fishmall.service.MemberReadHistoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * 会员商品浏览记录管理Controller
 *
 */
@RestController
@Api(tags = "MemberReadHistoryController", description = "会员商品浏览记录管理")
@RequestMapping("/member/readHistory")
public class MemberReadHistoryController {
	@Autowired
	private MemberReadHistoryService memberReadHistoryService;

	@ApiOperation("创建浏览记录")
	@PostMapping(value = "/create")
	public CommonResult create(@RequestBody MemberReadHistory memberReadHistory) {
		int count = memberReadHistoryService.create(memberReadHistory);
		if (count > 0) {
			return CommonResult.success(count);
		} else {
			return CommonResult.failed();
		}
	}

	@ApiOperation("删除浏览记录")
	@PostMapping(value = "/delete")
	public CommonResult delete(@RequestParam("ids") List<String> ids) {
		int count = memberReadHistoryService.delete(ids);
		if (count > 0) {
			return CommonResult.success(count);
		} else {
			return CommonResult.failed();
		}
	}

	@ApiOperation("展示浏览记录")
	@GetMapping(value = "/list")
	public CommonResult<List<MemberReadHistory>> list(Long memberId) {
		List<MemberReadHistory> memberReadHistoryList = memberReadHistoryService.list(memberId);
		if (memberReadHistoryList.isEmpty()) {
			MemberReadHistory inmemory = new MemberReadHistory();
			inmemory.setId("id");
			inmemory.setMemberId(10L);
			inmemory.setMemberNickname("会员昵称");
			inmemory.setMemberIcon("会员图标url");
			inmemory.setProductId(100L);
			inmemory.setProductName("商品名称");
			inmemory.setProductPic("商品图片url");
			inmemory.setProductSubTitle("商品标题");
			inmemory.setProductPrice("商品价格99");
			inmemory.setCreateTime(new Date());
			memberReadHistoryList.add(inmemory);
		}
		return CommonResult.success(memberReadHistoryList);
	}

}