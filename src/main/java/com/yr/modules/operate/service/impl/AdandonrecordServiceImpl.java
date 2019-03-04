package com.yr.modules.operate.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yr.common.utils.PageUtils;
import com.yr.common.utils.Query;
import com.yr.modules.operate.dao.AdandonrecordDao;
import com.yr.modules.operate.entity.AdandonrecordEntity;
import com.yr.modules.operate.service.AdandonrecordService;
import org.springframework.stereotype.Service;

import java.util.Map;



@Service("AdandonrecordService")
public class AdandonrecordServiceImpl extends ServiceImpl<AdandonrecordDao, AdandonrecordEntity> implements AdandonrecordService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AdandonrecordEntity> page = this.selectPage(
                new Query<AdandonrecordEntity>(params).getPage(),
                new EntityWrapper<AdandonrecordEntity>()
        );

        return new PageUtils(page);
    }

}
