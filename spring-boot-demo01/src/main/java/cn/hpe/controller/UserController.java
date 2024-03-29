package cn.hpe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.hpe.pojo.User;
import cn.hpe.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("listAll")
	public List<User> listAll(){
		
		return userService.listAll();
	}
	
}

