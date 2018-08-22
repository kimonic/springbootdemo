package controller.login;

import com.ding.springbootdemo.springbootbook.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {
    @GetMapping("/hello1")
    public String hello(@RequestParam(defaultValue = "world", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/aboutMe")
    public String index1(Model model) {
        User user = new User();
        user.setName("土豆金服");
        model.addAttribute("user", user);
        return "aboutme";
    }

    @GetMapping("/aboutfree")
    public String index2(Model model) {
        User user = new User();
        user.setName("土豆金服");
        model.addAttribute("user", user);
        return "aboutfree";
    }
    /**
     * Wed Aug 22 14:33:00 CST 2018 WARN: Establishing SSL connection without server's
     * identity verification is not recommended. According to MySQL 5.5.45+,
     * 5.6.26+ and 5.7.6+ requirements SSL connection must be established by
     * default if explicit option isn't set.
     * For compliance with existing applications not using SSL the
     * verifyServerCertificate property is set to 'false'.
     * You need either to explicitly disable SSL by setting useSSL=false,
     * or set useSSL=true and provide truststore for server certificate verification.
     */
}
