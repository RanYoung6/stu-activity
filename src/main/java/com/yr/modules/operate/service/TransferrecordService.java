package com.yr.modules.operate.service;

import com.baomidou.mybatisplus.service.IService;
import com.yr.common.utils.PageUtils;
import com.yr.modules.operate.entity.TransferrecordEntity;

import java.util.Map;

/**
 *
 *
 * @author yr
 * @date 2018-12-17 09:25:46
 */
public interface TransferrecordService extends IService<TransferrecordEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

