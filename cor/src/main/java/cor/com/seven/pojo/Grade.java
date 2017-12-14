package cor.com.seven.pojo;

import java.sql.Date;

public class Grade {

	private Integer stuNumber;
	private Integer language;
	private Integer math;
	private Integer english;
	private Date date;
	
	
	public Grade() {
	}
	public Grade(Integer stuNumber, Integer language, Integer math, Integer english, Date date) {
		this.stuNumber = stuNumber;
		this.language = language;
		this.math = math;
		this.english = english;
		this.date = date;
	}
	public Integer getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(Integer stuNumber) {
		this.stuNumber = stuNumber;
	}
	public Integer getLanguage() {
		return language;
	}
	public void setLanguage(Integer language) {
		this.language = language;
	}
	public Integer getMath() {
		return math;
	}
	public void setMath(Integer math) {
		this.math = math;
	}
	public Integer getEnglish() {
		return english;
	}
	public void setEnglish(Integer english) {
		this.english = english;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
