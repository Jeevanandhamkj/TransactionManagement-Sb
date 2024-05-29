package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.EmployeeReq;
import com.example.demo.Service.TransactionService;

@RestController
@RequestMapping("/kj")
public class TrasactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@PostMapping("/adding")
	public String addEmpDet(@RequestBody EmployeeReq employeeReq) {
		return transactionService.adding(employeeReq);
	}

}
