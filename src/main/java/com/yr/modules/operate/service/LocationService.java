package com.yr.modules.operate.service;

import com.baomidou.mybatisplus.service.IService;
import com.yr.common.utils.PageUtils;
import com.yr.modules.operate.entity.LocationEntity;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author yr
 * @date 2018-12-17 09:25:46
 */
public interface LocationService extends IService<LocationEntity> {

    PageUtils queryPage(Map<String, Object> params);

    public void updateRemarkByid(String locationid, String remark);

    public void updateStatusByid(String locationid, String status);

    /**
     *根据市(citycode)查询所有区
     * */
    public List<String> selectDistrictBycityCode(String citycode);
    /**
     *根据市(citycode)查询所有区
     **/
    public List<LocationEntity> selectBydistrict(String district);
}

