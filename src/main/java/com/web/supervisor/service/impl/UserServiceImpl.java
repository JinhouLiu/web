package com.web.supervisor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.web.supervisor.entity.User;
import com.web.supervisor.mapper.UserMapper;
import com.web.supervisor.service.UserService;

@Service("userService")
public class UserServiceImpl  implements UserService {

	@Resource(name = "userMapper")
	private  UserMapper   userMapper;
	
	@Override
	public List<User> findUser() {
		// TODO Auto-generated method stub
	  
		
 
	  return    userMapper.findUser();
		  
		
	}
}



