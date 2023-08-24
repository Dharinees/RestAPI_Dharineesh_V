package com.example.demo.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.UserModel.PetrolBunk;

public interface FuelRepo extends JpaRepository<PetrolBunk, Integer>{

}