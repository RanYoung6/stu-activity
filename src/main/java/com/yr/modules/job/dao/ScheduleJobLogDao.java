

package com.yr.modules.job.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yr.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {

}
