package com.mengma.ioc;

public class PersonServiceImpl implements PersonService {
	
	// 定义接口声明
	private PersonDao personDao;
	
	// 提供set方法，用于依赖注入
	public void setPersonDao(PersonDao personDao){
		this.personDao=personDao;
	}

	// 实现PersonService 接口方法
	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		personDao.add();// 调用PersonDao中的add方法
		System.out.println("addPerson()执行了 。。。。");
		

	}

}
