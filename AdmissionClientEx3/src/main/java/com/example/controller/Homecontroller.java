package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;

@RestController
public class Homecontroller {
	@GetMapping("/")
	public String m1()
	{
return"admission done";
}
	@PostMapping("/storestu")
	public String m2(@RequestBody Student stu )
	{System.out.println(stu.getRollno());
	System.out.println(stu.getName());
	System.out.println(stu.getAge());
		return "Student data saved";
	}
}