package com.cat.fishmall.service;

import com.cat.fishmall.mbg.model.PmsBrand;
import java.util.List;

/**
 * PmsBrandService
 * Created by macro on 2019/4/19.
 */
public interface PmsBrandService {
	com.cat.fishmallList<PmsBrand> listAllBrand();

	com.cat.fishmallint createBrand(PmsBrand brand);

	com.cat.fishmallint updateBrand(Long id, PmsBrand brand);

	com.cat.fishmallint deleteBrand(Long id);

	com.cat.fishmallList<PmsBrand> listBrand(int pageNum, int pageSize);

	com.cat.fishmallPmsBrand getBrand(Long id);
}

