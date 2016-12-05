package cn.sky.test1;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sky.dao.PersonDao;
import cn.sky.service.PersonService;

public class Test2 {
	ApplicationContext ctx;
	
	@Before
	public void test0(){
		ctx = new ClassPathXmlApplicationContext("beans3.xml");
	}
	
	@Test
	public void test1() {
//		PersonService ps = (PersonService) ctx.getBean("personService");
//		ps.save();
	}
	
	@Test
	public void test2() {
		PersonService ps = (PersonService) ctx.getBean("personServiceBean");//类的简单名称personServiceBean
		System.out.println(ps);
		PersonDao pd = (PersonDao) ctx.getBean("personDao");//注解的参数value="personDao"
		System.out.println(pd);
		((AbstractApplicationContext) ctx).close();
	}
	
	
}
