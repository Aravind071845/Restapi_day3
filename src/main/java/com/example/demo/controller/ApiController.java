package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {
	@Autowired
     ApiService apser;
	
	@PostMapping("post")
	public Employee adding(@RequestBody Employee ep)
	{
		return apser.saveinfo(ep);
	}
	
	@GetMapping("get")
	public List<Employee>showing()
	{
		return apser.showinfo();
	}
}
