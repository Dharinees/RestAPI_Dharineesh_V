package com.example.demo.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserModel.PetrolBunk;
import com.example.demo.UserRepository.FuelRepo;

@Service
public class FuelService {
	@Autowired
	public FuelRepo frepo;
	
	//post the data
	public PetrolBunk saveDetails(PetrolBunk p)
	{
		return frepo.save(p);
	}
	
	//get the data
	public List<PetrolBunk> getDetails()
	{
		return frepo.findAll();
	}
	
}