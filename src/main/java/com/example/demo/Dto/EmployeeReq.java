package com.example.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeReq {
	
private String empName;
	
	private int EmpAge;
	
	private String email;
	
	private String deptname;
	
	private String deptcode;
	
	

}
