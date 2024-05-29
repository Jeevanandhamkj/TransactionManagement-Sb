package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
