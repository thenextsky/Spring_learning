package cn.sky.service.impl;


public class PersonServiceBeanFactory{
	/**
	 * 静态工厂方法	
	 * @return
	 */
	public static PersonServiceBean createPersonServiceBean(){
		return new PersonServiceBean();
	}
	
	/**
	 * 实例工厂方法
	 * @return
	 */
	public PersonServiceBean createPersonServiceBean2(){
		return new PersonServiceBean();
	}
}
