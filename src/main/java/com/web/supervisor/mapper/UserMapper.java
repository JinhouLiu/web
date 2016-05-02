package com.web.supervisor.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.web.base.mapper.BaseMapper;
import com.web.supervisor.entity.User;
@Repository("userMapper")
public interface UserMapper extends BaseMapper{
	

	List<User>  listUser();  
	
   
}