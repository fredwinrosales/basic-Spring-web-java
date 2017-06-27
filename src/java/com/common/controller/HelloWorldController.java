package com.common.controller;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController{

    private ArrayList<String> saludo;
    
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
            saludo = new ArrayList<>();
            saludo.add("Hola mundo 1");
            saludo.add("Hola mundo 2");
            return new ModelAndView("HelloWorldPage", "saludo", saludo);
        }
}