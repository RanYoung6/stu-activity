package com.yr.modules.operate.service;

import com.baomidou.mybatisplus.service.IService;
import com.yr.common.utils.PageUtils;
import com.yr.modules.operate.entity.EquipmentEntity;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author yr
 * @date 2018-12-17 09:25:46
 */
public interface EquipmentService extends IService<EquipmentEntity> {

    PageUtils queryPage(Map<String, Object> params);

    public void updateAllByid( EquipmentEntity equipmentEntity,String id);

    List<String> selectAllType();

    List<String> selectAllCommunity();
}

