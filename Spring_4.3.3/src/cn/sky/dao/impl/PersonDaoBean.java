package cn.sky.dao.impl;

import cn.sky.dao.PersonDao;

public class PersonDaoBean implements PersonDao {
	
	@Override
	public void add(){
		System.out.println("PersonDaoBean的add方法");
	}
}
