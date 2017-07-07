package me.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import me.domain.User;


/**
 * @author www
 *
 */

public interface UserMapper {
	
	/**
	 * 根据用户登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 返回User对象或者null
	 */
	@Select("select * from tb_employee where loginname=#{loginname} and password=#{password}")
	User findUserWithLoginnameAndPassword(@Param("loginname") String loginname, @Param("password") String password);
	
	
}
