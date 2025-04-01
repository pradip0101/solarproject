package org.techhub.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller 
{
  @GetMapping("/home")
  public String displayhome()
  {
	  return "home";
  }
}
