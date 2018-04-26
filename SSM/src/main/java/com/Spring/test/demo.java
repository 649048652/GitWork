package com.Spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import  com.Spring.start.Order;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/Spring/start/ApplicationContexts.xml")
public class demo {
	@Autowired
	private Order order;
	
	@Test
	public void domo1() {
		order.PaySuccess();
	}
	
	@Test
	public void demo2() {
		System.out.println("我也不知道这是什么鬼东西？");
	}
}
