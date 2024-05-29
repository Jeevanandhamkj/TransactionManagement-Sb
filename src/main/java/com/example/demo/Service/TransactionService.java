package com.example.demo.Service;

import java.util.function.LongFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.EmployeeReq;
import com.example.demo.Model.Department;
import com.example.demo.Model.Employee;
import com.example.demo.Repo.DepartmentRepo;
import com.example.demo.Repo.EmployeeRepo;

import jakarta.transaction.Transactional;



@Service
public class TransactionService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Autowired
	DepartmentRepo departmentRepo;
	@Transactional
	public String adding(EmployeeReq employeeReq) {
		Department department=new Department();
		department.setDeptname(employeeReq.getDeptname());
		department.setDeptcode(employeeReq.getDeptcode());
		Long deptid=departmentRepo.save(department).getDeptId();
		
		Employee emp =null;
		emp.setEmpName(employeeReq.getEmpName());
		emp.setEmpAge(employeeReq.getEmpAge());
		emp.setEmail(employeeReq.getEmail());
		emp.setDeptId(deptid);
		Employee savEmployee=employeeRepo.save(emp);
		
		return "Employee is saved with Employee id :"+savEmployee.getEmpid();
	}
	
	


}
