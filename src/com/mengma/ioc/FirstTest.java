package com.mengma.ioc;




import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.test.context.TestExecutionListeners;

public class FirstTest {
	
	@Test
	public void test1(){
		//����Spring�����ļ���·��
		String xmlPath="applicationContext.xml";
		// ��ʼ��Spring���� ���������ļ�
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		// ͨ��������ȡpersonDaoʵ��
		PersonDao personDao = (PersonDao)applicationContext.getBean("personDao");
		
		//����personDao �ķ���
		personDao.add();
	}
}
