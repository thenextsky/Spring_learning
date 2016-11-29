package cn.sky.test1;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sky.domain.Person;
import cn.sky.service.PersonService;
import cn.sky.service.impl.PersonServiceBean;

public class Test1 {
	ApplicationContext ctx;
	
	@Before
	public void test0(){
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	//Bean的3种实例化方式
	@Test
	public void test1() {
//		PersonService ps = (PersonService) ctx.getBean("personService1");
//		PersonService ps = (PersonService) ctx.getBean("personService2");
		PersonService ps = (PersonService) ctx.getBean("personService3");
		ps.save();
	}
	
	//Bean的作用域Scope:singleton（默认）,prototype,request,session,global session
	@Test
	public void test2(){
		Person p1 = (Person) ctx.getBean("person");
		Person p2 = (Person) ctx.getBean("person");
		System.out.println(p1==p2);
	}
	
	//Bean的生命周期
	@Test
	public void test3(){
		PersonService psb = (PersonServiceBean) ctx.getBean("personService1");
		psb.save();
		((AbstractApplicationContext)ctx).close();
	}

}
