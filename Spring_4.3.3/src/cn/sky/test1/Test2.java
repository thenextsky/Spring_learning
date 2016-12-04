package cn.sky.test1;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sky.service.PersonService;

public class Test2 {
	ApplicationContext ctx;
	
	@Before
	public void test0(){
		ctx = new ClassPathXmlApplicationContext("beans2.xml");
	}
	
	@Test
	public void test1() {
		PersonService ps = (PersonService) ctx.getBean("personService");
		ps.save();
	}
	
	
}
