package com.Spring.start;

import org.springframework.stereotype.Repository;

@Repository("weixn")
public class NotifyServiceByWeixin implements NotifyService {

	@Override
	public void sendMessage(String message) {
		System.out.println("发送微信短信："+message);
	}

}
