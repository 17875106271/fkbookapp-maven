package cn.rambo.service.impl;

import cn.rambo.domain.User;
import cn.rambo.mapper.UserMapper;
import cn.rambo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(String loginname, String password) {
		// TODO Auto-generated method stub
		return userMapper.findWithLoginnameAndPassword(loginname, password);
	}

}
