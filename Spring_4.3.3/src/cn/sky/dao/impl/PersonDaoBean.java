package cn.sky.dao.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import cn.sky.dao.PersonDao;
@Repository(value="personDao")//可以自定义name，简写为：@Repository("personDao")
@Scope("prototype")
public class PersonDaoBean implements PersonDao {
	
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void add(){
		System.out.println("PersonDaoBean的add方法,id="+id);
	}
}
