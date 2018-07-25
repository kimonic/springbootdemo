package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 必须与SpringbootdemoApplication处于同级目录才能被访问
 */
@RestController
public class HelloWorld {
    @RequestMapping("/")
    public String say(){

        return "Hello World!";
    }




}
