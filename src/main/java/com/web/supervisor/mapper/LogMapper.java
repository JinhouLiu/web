package com.web.supervisor.mapper;

import java.util.List;

import com.web.base.mapper.BaseMapper;
import com.web.supervisor.entity.Log;

public interface LogMapper extends BaseMapper{
 
	List<Log>  listLog(); 
	
}