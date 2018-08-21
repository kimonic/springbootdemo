package com.ding.springbootdemo;

import com.ding.springbootdemo.springbootbook.UserRepository;
import com.ding.springbootdemo.springbootbook.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan("controller")
@EnableAutoConfiguration(exclude={
        JpaRepositoriesAutoConfiguration.class //禁止springboot自动加载持久化bean
})
@ComponentScan(basePackages = {"controller","com.ding.springbootdemo.springbootbook"})
public class SpringbootdemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);

    }
}


