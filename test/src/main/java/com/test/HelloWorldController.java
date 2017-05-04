package com.test;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller

public class HelloWorldController {
	
	 @RequestMapping(value="/", method=RequestMethod.GET)
     public String home(){
                     return "home";
     }
    
     @RequestMapping(value="/welcome", method=RequestMethod.GET)
     public String welcome(Model m){
                     m.addAttribute("name","Sushmita");
                     return "welcome";
     }

}
