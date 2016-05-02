package com.web.supervisor.mapper;

import java.util.List;

import com.web.base.mapper.BaseMapper;
import com.web.supervisor.entity.UserRole;

public interface UserRoleMapper extends BaseMapper{
  
	List<UserRole>  listUserRole();
	
}