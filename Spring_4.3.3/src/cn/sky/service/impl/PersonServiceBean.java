package cn.sky.service.impl;

import cn.sky.dao.PersonDao;
import cn.sky.service.PersonService;

public class PersonServiceBean implements PersonService {
	
	private PersonDao personDao;
	private PersonDao personDao2;
	
	public PersonDao getPersonDao2() {
		return personDao2;
	}

	public void setPersonDao2(PersonDao personDao2) {
		this.personDao2 = personDao2;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

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
		personDao.add();
		personDao2.add();
	}

}
