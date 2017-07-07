package me.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.domain.User;
import me.mapper.UserMapper;
import me.service.UserService;


/**
 * User 服务层接口实现类
 * @service("userService")用于将当前类注释为一个Spring的bean，名为userService
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{

	/**
	 * @Autowired 自动注入UserMapper
	 *
	 */
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * UserService 接口login方法实现
	 * @see { UserService}
	 */
	@Override
	public User login(String loginname, String password) {
		// TODO Auto-generated method stub
		return userMapper.findUserWithLoginnameAndPassword(loginname, password);
	}

}
