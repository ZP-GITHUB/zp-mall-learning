package com.zp.mall.tiny.service;

import com.zp.mall.tiny.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @author ZP
 * @date 2021/5/14.
 * 会员浏览记录管理Service
 */
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