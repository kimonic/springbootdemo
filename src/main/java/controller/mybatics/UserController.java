package controller.mybatics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mybatics")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public List<User> testQuery(){
        return userService.findAll();
    }


    @RequestMapping("/insert")
    public int testInsert(String name,String password,int age){
        return userService.insertNew(name,password,age);
    }


}
