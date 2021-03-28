package com.zp.mall.tiny.service;

import com.zp.mall.tiny.common.api.CommonResult;

/**
 * @author ZP
 * @date 2021/3/28.
 * 会员管理Service
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}