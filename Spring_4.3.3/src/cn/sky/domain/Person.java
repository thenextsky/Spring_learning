package cn.sky.domain;

public class Person {
	
	private String username;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Person(){
//		System.out.println("Person 构造方法");
	}
}
