package cn.sky.service.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import cn.sky.dao.PersonDao;
import cn.sky.service.PersonService;

@Service
@Scope("singleton")//默认bean的作用域是singleton
public class PersonServiceBean implements PersonService {
	//Resource可以标注在字段或者属性的setter方法上，若无指定name，则name=字段名||属性名
	//Resource按名称装配，如果找不到，则按类型装配；但是，如果指定了name:@Resource(name="personDao")则只能按名称装配，不会按类型了。
//	@Resource
	
	//Autowired：按类型装配。如果有多个bean类型一样，取第一个。
	//默认为：@Autowired(required=true)，表示必须要注入，若查找不到bean，则抛异常；=false，找不到则设置为null。
	//可以加入@Qualifier("personDao")，则按名称装配，找不到则抛异常
//	@Autowired(required=true)
//	@Qualifier("personDao")
	private PersonDao personDao;
	private PersonDao personDao2;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonServiceBean(PersonDao personDao,String name){
		this.personDao = personDao;
		this.name = name;
	}
	
	public PersonDao getPersonDao2() {
		return personDao2;
	}

	public void setPersonDao2(PersonDao personDao2) {
		this.personDao2 = personDao2;
	}
	public PersonDao getPersonDao() {
		return personDao;
	}
	//标注在属性personDao的setter方法上，则使用属性名：personDao查找并注入
//	@Resource
	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@PostConstruct
	public void init(){
		System.out.println("打开资源");
	}
	@PreDestroy//当Scope为singleton&&ctx.close()才会调用destroy()
	public void destroy(){
		System.out.println("释放资源");
	}
	
	public PersonServiceBean() {
		System.out.println("PersonServiceBean 的构造方法");
	}
	
	@Override
	public void save(){
		personDao.add();
	}

}
