package com.cat.fishmall.service.impl;

import com.cat.fishmall.mbg.mapper.PmsProductMapper;
import com.cat.fishmall.nosql.elasticsearch.document.EsProduct;
import com.cat.fishmall.nosql.elasticsearch.repository.EsProductRepository;
import com.cat.fishmall.service.EsProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/28
 * @Version: V1.0
 * @Description:
 **/
@Slf4j
@Service
public class EsProductServiceImpl implements EsProductService {

	@Autowired
	private PmsProductMapper pmsProductMapper;

	@Autowired
	private EsProductRepository productRepository;

	@Override
	public int importAll() {

		List<EsProduct> esProductList = pmsProductMapper.getAllEsProductList(null);
		Iterable<EsProduct> esProductIterable = productRepository.saveAll(esProductList);
		Iterator<EsProduct> iterator = esProductIterable.iterator();
		int result = 0;
		while (iterator.hasNext()) {
			result++;
			iterator.next();
		}
		return result;
	}

	@Override
	public void delete(long id) {
		productRepository.deleteById(id);
	}

	@Override
	public EsProduct create(Long id) {
		EsProduct esProduct = null;
		List<EsProduct> productList = pmsProductMapper.getAllEsProductList(id);
		if (!productList.isEmpty()) {
			esProduct = productList.get(0);
			esProduct = productRepository.save(esProduct);
		}
		return esProduct;
	}

	@Override
	public void delete(List<Long> ids) {
		if (CollectionUtils.isEmpty(ids)) {
			return;
		}
		List<EsProduct> esProductList = ids.stream().map(t -> {
			EsProduct product = new EsProduct();
			product.setId(t);
			return product;
		}).collect(Collectors.toList());
		productRepository.deleteAll(esProductList);
	}

	@Override
	public Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize) {
		Pageable pageable = PageRequest.of(pageNum, pageSize);
		return productRepository.findByNameOrSubTitleOrKeywords(keyword, keyword, keyword, pageable);
	}

}
