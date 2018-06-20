package controller.mybatics;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value = "userDao")
public interface UserDao {

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user(name) values(#{name})")
    int insertNew(@Param("name") String name);

}
