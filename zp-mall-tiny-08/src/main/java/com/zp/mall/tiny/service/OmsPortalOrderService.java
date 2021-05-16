package com.zp.mall.tiny.service;

import com.zp.mall.tiny.common.api.CommonResult;
import com.zp.mall.tiny.dto.OrderParam;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ZP
 * @date 2021/5/16.
 * 前台订单管理Service
 */
public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    CommonResult generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}