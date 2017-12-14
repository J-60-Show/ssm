package cor.com.seven.pojo;

public enum Gender {
	MAN("男",0),
	WOMAN("女",1);
	
	private String name;
	private int index;
	
	private Gender(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public static String getName(int index){
		for (Gender gender : Gender.values()) {
			if(gender.getIndex() == index){
				return gender.getName();
			}
		}
		return null;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}

