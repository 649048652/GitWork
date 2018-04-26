package com.Spring.start;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Service("fireassist")
public class FireAssist {
	@Before(value = "execution(* *.sendMessage(..))")
	public void ActionLog() {
		System.out.println("发送时间：" + (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));
	}
	
	@After(value = "execution(* *.sendMessage(..))")
	public void ReportComplete() {
		System.out.println("报告长官： 打完收工！");
	}
	
}
