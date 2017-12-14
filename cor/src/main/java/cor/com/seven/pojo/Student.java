package cor.com.seven.pojo;
/**
 * 
 * @Title:  Student.java
 * @Package cor.com.seven.pojo
 * @Description: 学生类
 * @date  2017年12月8日 上午11:34:49
 * @version V1.0
 * @author seven
 */
public class Student {

	private String name;
	private Integer age;
	private Gender gender;
	private Integer stuNumber;
	
	
	public Student() {
	}
	public Student(String name, Integer age, Gender gender, Integer stuNumber) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.stuNumber = stuNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Integer getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(Integer stuNumber) {
		this.stuNumber = stuNumber;
	}
	
	
}
