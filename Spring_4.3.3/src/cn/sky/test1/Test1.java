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

	//bean的注入
	@Test
	public void test4(){
		PersonService ps = (PersonService) ctx.getBean("personService1");
		ps.save();
	}
	
	//普通属性的注入
	@Test
	public void test5(){
		Person p = (Person) ctx.getBean("person");
		System.out.println(p.getUsername()+";"+p.getAge());
	}
	
	//set、list、propeities、map的注入
	@Test
	public void test6() {
		Person p = (Person) ctx.getBean("person");
		System.out.println(p.getSet());
		System.out.println(p.getList());
		System.out.println(p.getProps());
		System.out.println(p.getMap());
	}
}
