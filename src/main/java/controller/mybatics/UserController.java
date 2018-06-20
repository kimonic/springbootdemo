package controller.mybatics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/mybatics")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    public List<User> testQuery(){
        return userService.findAll();
    }


    @RequestMapping("/insert")
    public int testInsert(){
        return userService.insertNew("mybatics");
    }


}
