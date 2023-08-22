package com.example.demo.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class D1EX3 {
private String yourFavColor="Green";
@GetMapping("get1")
public String getMyFav()
{
	return "My favourite color is "+ yourFavColor;
}
}
