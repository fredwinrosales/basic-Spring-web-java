package controller;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author frosales <fredwinrosales@gmail.com>
 */
@Component
public class TestController {
    
    @RequestMapping("/hello")  
    public ModelAndView showform(){  
        return new ModelAndView("HelloWorldPage");  
    }  
    
}
