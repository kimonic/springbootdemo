package controller.mybatics;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "userDao")
public interface UserDao {

    @Select("select * from users")
    List<User> findAll();

    @Insert("insert into users(name,password,age) values(#{name},#{password},#{age})")
    int insertNew(@Param("name") String name,@Param("password") String passwor,
                  @Param("age") int age);

}
