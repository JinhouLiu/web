package com.web.supervisor.mapper;

import java.util.List;

import com.web.base.mapper.BaseMapper;
import com.web.supervisor.entity.ResUser;

public interface ResUserMapper extends BaseMapper{
 
List<ResUser>	 listResUser();
	
}