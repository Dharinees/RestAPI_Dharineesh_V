package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BikeModel;
import com.example.demo.service.BikeService;

@RestController
public class BikeController {
	@Autowired
	BikeService bser;
	@PostMapping("addbike")
	public BikeModel add(@RequestBody BikeModel ss) {
		return bser.saveinfo(ss);
	 }
	@GetMapping("showbike")
	public List<BikeModel> show(){
		return bser.showinfo();
	}
	@PutMapping("updatebike")
	public BikeModel modify(@RequestBody BikeModel s) {
		return bser.changeinfo(s);
	}
	@DeleteMapping("del")
	public String delinfo(@RequestBody BikeModel s) {
		 bser.deleteinfo(s);
		 return "Deleted successfully";
	}
	@GetMapping("showqueryyear/{year}")
	public List<BikeModel> getstu(@PathVariable int year){
		return bser.getbikeyear(year);
	}
	@GetMapping("showqueryname/{name}")
	public List<BikeModel> getstu(@PathVariable String name){
		return bser.getbikename(name);
	}
	@GetMapping("showquery/{year}/{name}")
	public List<BikeModel> getstu(@PathVariable int year,@PathVariable String name){
		return bser.getinfo(year, name);
	}
}
