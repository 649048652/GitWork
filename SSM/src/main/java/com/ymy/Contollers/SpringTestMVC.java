package com.ymy.Contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ymy.Entity.User;

@Controller
@RequestMapping("/t")
public class SpringTestMVC {		
	@RequestMapping(method=RequestMethod.GET, value="/index")
	public ModelAndView demo1() {
		return new ModelAndView("/loginIn/LoginReturn", "command", new User());
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/redirect{i}")
	public String redirect(@PathVariable Integer i) {
		return "redirect:demo"+i;
	}
	
	@RequestMapping(value="/demo2", method=RequestMethod.GET)
	public String demo2() {
		return "/loginIn/LoginIn";
	}
	
	@RequestMapping(value="/demo3", method= RequestMethod.POST)
	public String demo3(@ModelAttribute User user, ModelMap model) {
		model.addAttribute(user);
		return "/loginIn/LoginIn";
	}
	
}
