package com.ding.springbootdemo;

import com.ding.springbootdemo.springbootbook.entity.Department;
import com.ding.springbootdemo.springbootbook.entity.Role;
import com.ding.springbootdemo.springbootbook.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.ding.springbootdemo.springbootbook.*;

import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JpaConfiguration.class})
public class JpaTest {
    private static Logger logger=LoggerFactory.getLogger(JpaTest.class);
    /**
     * Caused by: org.springframework.beans.factory.BeanCreationException:
     * Error creating bean with name 'jpaMappingContext':
     * Invocation of init method failed; nested exception is java.lang.IllegalArgumentException:
     * At least one JPA metamodel must be present!
     */
    @Autowired
    UserRepository userRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    RoleRepository roleRepository;
    @Before
    public void init(){
        userRepository.deleteAll();
        departmentRepository.deleteAll();
        roleRepository.deleteAll();

        Department department=new Department();
        department.setName("研发部");
        departmentRepository.save(department);
        Assert.assertNotNull(department.getId());

        Role role=new Role();
        role.setName("admin");
        roleRepository.save(role);
        Assert.assertNotNull(role.getId());

        User user=new User();
        user.setName("user");
        user.setCreateDate(new Date());
        user.setDepartment(department);

        List<Role> roles=roleRepository.findAll();
        Assert.assertNotNull(roles);
        user.setRoles(roles);

        userRepository.save(user);
        Assert.assertNotNull(user.getId());

    }

    @Test
    public void findPage(){
//        Assert.assertNotNull(userRepository.findAll());
//        Assert.assertNotNull(roleRepository.findAll());
//        Assert.assertNotNull(departmentRepository.findAll());

        Pageable pageable= new PageRequest(0,10,new Sort(Sort.Direction.ASC,"id"));
        Page<User> page=userRepository.findAll(pageable);
        Assert.assertNotNull(page);
        for (User user:page.getContent()) {
            logger.info("=============user========"+user.getName());
        }
    }
}
