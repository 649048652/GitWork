package com.ymy.Contollers;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ymy.Entity.User;


@Controller
@RequestMapping("/hello")
public class SpringMvcs {
	@Autowired
	private User user;
	
	private static Logger log = LoggerFactory.getLogger(SpringMvcs.class);

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView printHello(ModelAndView mv) {
		user.setId(0);
		user.setMoney(100);
		user.setName("张三");
		
		log.debug("啦啦allA拿来a ");
		log.debug(ReflectionToStringBuilder.toString(user));
	
		mv.addObject(user);
		mv.setViewName("index");
		return mv;
	}
	
	
	@RequestMapping(value="/{moneys}", method=RequestMethod.GET)
	public @ResponseBody User getUserJosn(@PathVariable Integer moneys) {
		return User.getJosnMoney(moneys);
	}
	
	

}
