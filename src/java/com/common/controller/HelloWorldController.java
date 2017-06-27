package com.common.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class HelloWorldController{

    private ArrayList<String> saludo;
        
        @RequestMapping("/test2")
        public String helloWorld(Model model) {
            model.addAttribute("message", "Hello World!");
            return "HelloWorldPage";
        }
    
	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody Shop getShopInJSON(@PathVariable String name) {

		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});

		return shop;
	}
    
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
            saludo = new ArrayList<>();
            saludo.add("Hola mundo 1");
            saludo.add("Hola mundo 2");
            return new ModelAndView("HelloWorldPage", "saludo", saludo);
        }
}