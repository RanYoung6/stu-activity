package com.yr.modules.operate.service.impl;

import com.yr.modules.operate.dao.EquipmentDao;
import com.yr.modules.operate.dao.LocationDao;
import com.yr.modules.operate.entity.EquipmentStatistics;
import com.yr.modules.operate.entity.LocationStatistics;
import com.yr.modules.operate.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("StatisticsService ")
public class StatisticsServiceImpl implements StatisticsService {
    @Autowired
    private EquipmentDao equipmentDao;
    @Autowired
    private LocationDao locationDao;
    @Override
    public List<EquipmentStatistics> EquipmentStatistics(String startDate, String endDate) {
        return equipmentDao.statisticsbydate(startDate, endDate);
    }

    @Override
    public List<LocationStatistics> getLocationStatistics() {
        return locationDao.getLocationStatistics();
    }
}
