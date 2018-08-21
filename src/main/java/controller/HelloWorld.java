package controller;

import com.ding.springbootdemo.springbootbook.DepartmentRepository;
import com.ding.springbootdemo.springbootbook.RoleRepository;
import com.ding.springbootdemo.springbootbook.UserRepository;
import com.ding.springbootdemo.springbootbook.entity.Department;
import com.ding.springbootdemo.springbootbook.entity.Role;
import com.ding.springbootdemo.springbootbook.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * 必须与SpringbootdemoApplication处于同级目录才能被访问
 */
@RestController
public class HelloWorld {

    @Autowired
    UserRepository userRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    RoleRepository roleRepository;

    @RequestMapping("/")
    public String say(){
        Department department=new Department();
        department.setName("研发部");
        departmentRepository.save(department);

        Role role=new Role();
        role.setName("admin");
        roleRepository.save(role);

        User user=new User();
        user.setName("user");
        user.setCreateDate(new Date());
        user.setDepartment(department);

        List<Role> roles=roleRepository.findAll();
        user.setRoles(roles);

        userRepository.save(user);
        return "Hello World!";
    }




}
