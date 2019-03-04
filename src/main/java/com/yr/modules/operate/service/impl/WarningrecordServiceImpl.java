package com.yr.modules.operate.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yr.common.utils.PageUtils;
import com.yr.common.utils.Query;
import com.yr.modules.operate.dao.WarningrecordDao;
import com.yr.modules.operate.entity.WarningrecordEntity;
import com.yr.modules.operate.service.WarningrecordService;
import org.springframework.stereotype.Service;

import java.util.Map;



@Service("WarningrecordService")
public class WarningrecordServiceImpl extends ServiceImpl<WarningrecordDao, WarningrecordEntity> implements WarningrecordService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WarningrecordEntity> page = this.selectPage(
                new Query<WarningrecordEntity>(params).getPage(),
                new EntityWrapper<WarningrecordEntity>()
        );

        return new PageUtils(page);
    }

}
