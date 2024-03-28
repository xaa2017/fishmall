package com.cat.fishmall.service;

import com.cat.fishmall.nosql.elasticsearch.document.EsProduct;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @Author: xiaoanan
 * @Date: 2024/3/28
 * @Version: V1.0
 * @Description:
 **/
public interface EsProductService {

	/**
	 * 从数据库中导入所有商品到ES
	 * @return
	 */
	int importAll();

	/**
	 * 根据id 删除商品
	 * @param id
	 */
	void delete(long id);

	/**
	 * 根据id 创建商品
	 * @param id
	 * @return
	 */
	EsProduct create(Long id);

	/**
	 * 批量删除
	 * @param ids
	 */
	void delete(List<Long> ids);

	/**
	 * 搜索商品
	 * @param keyword
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

}
