package controller.login;

import controller.mybatics.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String  login(HttpServletRequest request){
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        System.out.println("name:"+name+"----password:"+password);

        if (userService.find(name,password)==1){
            return name+"登陆成功!";
        }else {
            return name+"登陆失败!";
        }
    }
}
