package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.BikeModel;

public interface BikeRepo extends JpaRepository<BikeModel, Integer>{
	@Query(value = "select * from Bike where year=:ns",nativeQuery = true)
	public List<BikeModel> getBikeinfoyear(@Param("ns") int year);
	@Query(value = "select * from Bike where year=:ns or bikename=:s",nativeQuery = true)
	public List<BikeModel> getBikeinfo(@Param("ns") int year,@Param("s") String bikename);
	@Query(value = "select * from Bike where bikename=:s",nativeQuery = true)
	public List<BikeModel> getBikename(@Param("s") String bikename);
}
