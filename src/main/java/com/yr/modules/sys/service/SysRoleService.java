package com.yr.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.yr.common.utils.PageUtils;
import com.yr.modules.sys.entity.SysRoleEntity;

import java.util.List;
import java.util.Map;


/**
 * 角色
 */
public interface SysRoleService extends IService<SysRoleEntity> {

	PageUtils queryPage(Map<String, Object> params);

	void save(SysRoleEntity role);

	void update(SysRoleEntity role);

	void deleteBatch(Long[] roleIds);


	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}
