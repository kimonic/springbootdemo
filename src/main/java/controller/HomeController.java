package controller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * 访问主页
 */
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String hello(HttpServletResponse response){
        System.out.println("response"+response);
//https://www.cnblogs.com/EasonJim/p/7459486.html  重定向网页
        return "index";
    }
}
