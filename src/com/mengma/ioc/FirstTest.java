package com.mengma.ioc;




import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.test.context.TestExecutionListeners;

public class FirstTest {
	
	@Test
	public void test1(){
		//定义Spring配置文件的路径
		String xmlPath="applicationContext.xml";
		// 初始化Spring容器 加载配置文件
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		// 通过容器获取personDao实例
		PersonDao personDao = (PersonDao)applicationContext.getBean("personDao");
		
		//调用personDao 的方法
		personDao.add();
	}
}
