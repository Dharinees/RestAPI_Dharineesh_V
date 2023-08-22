package com.example.demo.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class D1EX2 {
@GetMapping("/get")
public String getName()
{
	String studentName="Iamneo";
	return "Welcome " + studentName+" ! ";
}
}
