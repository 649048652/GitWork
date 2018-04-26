package com.ymy.Entity;

import org.springframework.stereotype.Service;

@Service("user") 
public class User {
	private int id;
	private float money;
	private String name;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static User getJosnMoney(int moneys) {
		User user = new User();
		user.id=1;
		user.money = moneys;
		user.name = "lala";
		return user;
	}
}
