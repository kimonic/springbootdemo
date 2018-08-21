package com.ding.springbootdemo.springbootbook;

import com.ding.springbootdemo.springbootbook.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface UserRepository extends JpaRepository<User,Long> {
}
