package com.web.supervisor.mapper;

import java.util.List;

import com.web.base.mapper.BaseMapper;
import com.web.supervisor.entity.Resources;

public interface ResourcesMapper  extends BaseMapper{
   
   List<Resources>	 listResources();
	
}