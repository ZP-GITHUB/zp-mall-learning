package com.zp.mall.tiny.service;

import com.zp.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author ZP
 * @date 2021/3/28.
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}