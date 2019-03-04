package com.yr.modules.operate.service;

import com.yr.modules.operate.entity.EquipmentStatistics;
import com.yr.modules.operate.entity.LocationStatistics;

import java.util.List;

public interface StatisticsService {
    public List<EquipmentStatistics> EquipmentStatistics(String startDate, String endDate);

    /**
     *获取按区分类统计小区数量
     * */
    public List<LocationStatistics> getLocationStatistics();
}
