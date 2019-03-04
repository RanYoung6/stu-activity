

package com.yr.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yr.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
