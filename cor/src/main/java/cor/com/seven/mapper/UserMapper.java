package cor.com.seven.mapper;

import cor.com.seven.pojo.User;

public interface UserMapper {

	User selectUserByUser(User user);
	
	int insertUser(User user);
}
