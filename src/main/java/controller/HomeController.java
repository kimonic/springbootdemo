package controller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 访问主页
 */
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
