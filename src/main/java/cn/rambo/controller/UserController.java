package cn.rambo.controller;

import javax.servlet.http.HttpSession;

import cn.rambo.domain.User;
import cn.rambo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login(
			String loginname, String password,
			ModelAndView mv, HttpSession httpSession) {
		User user = userService.login(loginname, password);
		if(user == null) {
			mv.addObject("message", "登陆错误");
			mv.setViewName("loginForm");
		}
		else {
			httpSession.setAttribute("user", user);
			mv.setView(new RedirectView("/fkbookapp-maven/main"));
		}
		return mv;
	}
}
