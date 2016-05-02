package com.web.supervisor.mapper;

import java.util.List;

import com.web.base.mapper.BaseMapper;
import com.web.supervisor.entity.Role;

public interface RoleMapper extends  BaseMapper{
  
	List<Role>  listRole();	
	
}