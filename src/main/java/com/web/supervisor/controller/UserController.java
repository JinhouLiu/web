package com.web.supervisor.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.web.supervisor.entity.User;
import com.web.supervisor.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value = "/list")
	public List<User> listUser(User user, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "5") int rows) {

		PageHelper.startPage(page, rows);
		List<User> list = userService.findUser();
		for (User fuck : list) {

			System.out.println(fuck.toString());

		}
		return null;
	}

	/* 添加用户 */
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public void addUser() {

	}

}
