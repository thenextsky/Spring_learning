package cn.sky.service.impl;

import cn.sky.service.PersonService;

public class PersonServiceBean implements PersonService {
	
	public void init(){
		System.out.println("打开资源");
	}
	
	public void destroy(){
		System.out.println("释放资源");
	}
	
	public PersonServiceBean() {
		System.out.println("PersonServiceBean 的构造方法");
	}
	
	@Override
	public void save(){
		System.out.println("PersonServiceBean 的save()方法");
	}

}
