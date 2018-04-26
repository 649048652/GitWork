package com.Spring.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Order {
	@Autowired
	@Qualifier("weixn")
	private NotifyService notifyservice;
	
	public void PaySuccess() {
		notifyservice.sendMessage("客户给ABC完成订单2018417付款，一共97.5元");
	}
}
