package me.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import me.domain.User;
import me.service.UserService;


/**
 * 处理用户请求控制器
 *
 */

@Controller
public class UserController {
	
	/**
	 * 自动注入userService
	 *
	 */
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@RequestMapping(value="/login")
	public ModelAndView login(
			String loginname,
			String password,
			ModelAndView mView,
			HttpSession session){
		//根据登录名和密码查找用户
		User user= userService.login(loginname, password);
		if(user!=null){
			//登陆成功，将User对象时设置到httpSession作用范围域
			session.setAttribute("user", user);
			mView.setView(new RedirectView("/SpringmvcMybatis/main"));
		}else{
			mView.addObject("message", "登录名或密码错误，请重新输入！");
			mView.setViewName("loginForm");
		}
		return mView;
	}
	
}
