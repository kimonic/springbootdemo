package com.ding.springbootdemo.springbootbook;

import com.ding.springbootdemo.springbootbook.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
