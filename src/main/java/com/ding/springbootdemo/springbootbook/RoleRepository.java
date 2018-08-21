package com.ding.springbootdemo.springbootbook;

import com.ding.springbootdemo.springbootbook.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
