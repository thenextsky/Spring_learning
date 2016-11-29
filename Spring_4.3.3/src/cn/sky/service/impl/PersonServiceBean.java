package cn.sky.service.impl;

import cn.sky.service.PersonService;

public class PersonServiceBean implements PersonService {
	
	public PersonServiceBean() {
		System.out.println("PersonServiceBean 的构造方法");
	}
	
	@Override
	public void save(){
		System.out.println("PersonServiceBean 的save()方法");
	}

}
