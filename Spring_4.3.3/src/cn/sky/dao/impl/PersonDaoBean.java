package cn.sky.dao.impl;

import cn.sky.dao.PersonDao;

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
