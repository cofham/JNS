package com.jns.ksg.maventest.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	String msg ="mvc!";

	//home
	@RequestMapping("/home")public String Home(){
		System.out.println("home in controller");
		return "index";
	}
	
	/*
	 * @RequestMapping("/home") public ModelAndView showMessage(
	 * 
	 * @RequestParam(value="name",required=false,defaultValue="World")String name) {
	 * System.out.println("in controller"); 
	 * //WEB-INF/views abc.jsp 
	 * ModelAndView mv = new ModelAndView("abc");
	 * mv.addObject("message",msg);
	 * mv.addObject("name",name); return mv;}
	 * 
	 */
	
	//getParam,sendParam
	@RequestMapping(value="/formtest.do",method=RequestMethod.POST)
	public String getParam(
			@RequestParam("user_text") String user_text,
			Model model,
			HttpServletResponse response
			) throws Exception{
		System.out.println("user_text="+user_text);
		/*
		 * if(user_text.length() == 0) { System.out.println("null"); }else {
		 * System.out.println("not null"); }
		 */
		model.addAttribute("user_text", user_text);
		return "Text_output";
	}
	
	
	/*
	 * public ModelAndView a(Model model) { model.addAttribute("echoForm",new
	 * EchoForm()); System.out.println("echoForm"); ModelAndView mv = new
	 * ModelAndView("abc"); return mv;
	 * 
	 * }
	 */
	
}
