

package com.yr.modules.job.service;

import com.baomidou.mybatisplus.service.IService;
import com.yr.common.utils.PageUtils;
import com.yr.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;


/**
 * 定时任务日志
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {
	PageUtils queryPage(Map<String, Object> params);

}
