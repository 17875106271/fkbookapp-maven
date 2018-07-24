package cn.rambo.service;

import cn.rambo.domain.User;

public interface UserService {

	User login(String loginname, String password);
}
