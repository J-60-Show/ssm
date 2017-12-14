package cor.com.seven.service;
/**
 * 
 * @Title:  IUserService.java
 * @Package cor.com.seven.service
 * @Description: 用户业务层
 * @date  2017年12月7日 下午5:25:28
 * @version V1.0
 * @author seven
 */

import cor.com.seven.pojo.User;

public interface IUserService {
	/**
	 * 用户登录
	 * @time 2017年12月7日 下午5:26:01
	 * @return 用户
	 */
	User login(User user);
	
	/**
	 * 用户注册
	 * @time 2017年12月8日 上午10:57:31
	 * @return 是否注册成功
	 */
	boolean reg(User user);
}
