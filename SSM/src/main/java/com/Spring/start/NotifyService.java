package com.Spring.start;

import org.springframework.stereotype.Repository;

@Repository
public interface NotifyService {
	void sendMessage(String message);
}
