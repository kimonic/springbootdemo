package controller;

import controller.mybatics.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import utils.LUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * 访问主页
 */
@Controller
public class HomeController {
    @Autowired
    private UserService service;

    @RequestMapping("/index1")
    public String hello(HttpServletRequest request) {

        System.out.println("request" + request.getParameter("name"));
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        int age = Integer.parseInt(request.getParameter("age"));
        service.insertNew(name, password, age);
//https://www.cnblogs.com/EasonJim/p/7459486.html  重定向网页
        request.setAttribute("add", service.findAll());
        return "showuser";
    }

    /**
     * 直接在参数中添加HttpSession,HttpServletRequest,HttpServletResponse
     * 就可以操作session,request,response
     * 通过response.sendRedirect("/html/hello.html");直接将网页重定向到html
     */
    @RequestMapping("/index")
    public String hello1(HttpSession session) {
        LUtils.info();
        session.setAttribute("sessionarg", "session参数");
        return "index";
    }


    @RequestMapping("/index2")
    public ModelAndView hello2(HttpSession session) {
        ModelAndView view = new ModelAndView();
        view.setViewName("ipshow");//由springboot的处理器直接返回响应的视图名称
        return view;
    }
}
