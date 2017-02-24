package br.com.season.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello(){
		
		return "hello";
	}
	
	@RequestMapping("/teste")
    public ModelAndView getListUsersView() {
        
        return new ModelAndView("teste");
    }


}
