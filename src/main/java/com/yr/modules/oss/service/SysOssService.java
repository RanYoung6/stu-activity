

package com.yr.modules.oss.service;

import com.baomidou.mybatisplus.service.IService;
import com.yr.common.utils.PageUtils;
import com.yr.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
