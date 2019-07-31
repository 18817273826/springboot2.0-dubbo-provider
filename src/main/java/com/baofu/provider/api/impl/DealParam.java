package com.baofu.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baofu.provider.api.IDealParam;

@Service
public class DealParam implements IDealParam {

    @Override
    public String dealParam(String str) {
        return "我接受到了参数"+str+"    哈哈哈";
    }
}
