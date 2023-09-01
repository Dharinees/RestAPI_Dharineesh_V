package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BikeModel;
import com.example.demo.repository.BikeRepo;

@Service
public class BikeService {
	@Autowired
	BikeRepo reb;
	public BikeModel saveinfo (BikeModel ss){
		   return reb.save(ss);
	}
	public List<BikeModel> showinfo(){
		   return reb.findAll();
	}
	public BikeModel changeinfo(BikeModel s) {
		   return reb.saveAndFlush(s);
	}
	public void deleteinfo(BikeModel s) {
		   reb.delete(s);
	}
	public List<BikeModel> getbikeyear(int year){
		   return reb.getBikeinfoyear(year);
	}
	public List<BikeModel> getbikename(String s){
		   return reb.getBikename(s);
	}
	public List<BikeModel> getinfo(int id,String s){
		   return reb.getBikeinfo(id,s);
	}
}