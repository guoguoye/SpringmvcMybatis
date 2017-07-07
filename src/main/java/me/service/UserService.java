package me.service;

import me.domain.User;

/**
 * User服务层接口
 * @author www
 *
 */
public interface UserService {

	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 返回User对象或者Null
	 *
	 */
	User login(String loginname,String password);
}
