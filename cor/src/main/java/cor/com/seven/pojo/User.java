package cor.com.seven.pojo;

/**
 * 
 * @Title: User.java
 * @Package cor.com.seven.pojo
 * @Description: TODO
 * @date 2017年12月7日 下午5:23:51
 * @version V1.0
 * @author seven
 */
public class User {
	private int id;
	private String password;

	public User() {
	}

	public User(int id, String password) {
		this.id = id;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
