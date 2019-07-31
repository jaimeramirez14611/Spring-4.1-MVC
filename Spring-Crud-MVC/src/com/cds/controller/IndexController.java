package com.cds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
  ModelAndView mv = new ModelAndView();	
  
  @RequestMapping("/")	
  public String showIndex(Model model) {
	  model.addAttribute("mensaje","Hola este es un mensaje desde el controller");
	  return "index";
  }
  
  @RequestMapping("/about")	
  public String showabout() {
	  return "about";
  }
}
