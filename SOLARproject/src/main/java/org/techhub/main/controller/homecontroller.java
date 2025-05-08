package org.techhub.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller 
{
  @GetMapping("/index")
  public String displayhome()
  {
	  return "index";
  }
  @GetMapping("/about")
  public String displayabout()
  {
	  return "about";
  }
  
  //service section mapping
  @GetMapping("/service1")
  public String displaone()
  {
	  return "service1";
  }
  
  
  
  @GetMapping("/completepro")
  public String displyss()
  {
	  return "completepro";
  }
  @GetMapping("/contact")
  public String displycontact()
  {
	  return "contact";
  }
  
  
  
  
}
