package com.cat.fishmall.service.impl;

import com.cat.fishmall.mbg.mapper.PmsBrandMapper;
import com.cat.fishmall.mbg.model.PmsBrand;
import com.cat.fishmall.service.PmsBrandService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PmsBrandService实现类
 * Created by macro on 2019/4/19.
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
	@Autowired
	private PmsBrandMapper brandMapper;

	@Override
	public List<PmsBrand> listAllBrand() {
		return brandMapper.listAll();
	}

	@Override
	public int createBrand(PmsBrand brand) {
		return brandMapper.insertSelective(brand);
	}

	@Override
	public int updateBrand(Long id, PmsBrand brand) {
		brand.setId(id);
		return brandMapper.updateByPrimaryKeySelective(brand);
	}

	@Override
	public int deleteBrand(Long id) {
		return brandMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<PmsBrand> listBrand(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return brandMapper.listAll();
	}

	@Override
	public PmsBrand getBrand(Long id) {
		return brandMapper.selectByPrimaryKey(id);
	}
}

