package cn.sky.test1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sky.service.PersonService;

public class Test1 {
	
	@Test
	public void test1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//		PersonService ps = (PersonService) ctx.getBean("personService1");
//		PersonService ps = (PersonService) ctx.getBean("personService2");
		PersonService ps = (PersonService) ctx.getBean("personService3");
		ps.save();
	}

}
