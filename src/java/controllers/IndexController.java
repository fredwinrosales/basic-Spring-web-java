package controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author frosales <fredwinrosales@gmail.com>
 */
@Controller
public class IndexController {
    
    @RequestMapping("/register")  
    public ModelAndView index(){
        
        return new ModelAndView("Register");
        
    }  
    
}
