package cor.com.seven.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cor.com.seven.mapper.UserMapper;
import cor.com.seven.pojo.User;
import cor.com.seven.service.IUserService;

@Service
@Transactional
public class UserService implements IUserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(User user) {
		 User findUser = userMapper.selectUserByUser(user);
		 if(findUser != null){
			 return findUser;
		 }
		return null;
	}

	@Override
	public boolean reg(User user) {
		int result = userMapper.insertUser(user);
		if(result != 0){
			return true;
		}
		return false;
	}

}
