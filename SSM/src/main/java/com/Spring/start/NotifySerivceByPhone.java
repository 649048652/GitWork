package com.Spring.start;

import org.springframework.stereotype.Repository;

@Repository("phone")
public class NotifySerivceByPhone implements NotifyService{

	@Override
	public void sendMessage(String message) {
		System.out.println("发送手机短信："+message);
	}
	
}
