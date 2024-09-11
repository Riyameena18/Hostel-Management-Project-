package com.service;

import java.util.List;


import com.dto.RoomAllocationDetail;

import com.repository.RoomAllocationRepository;

public class RoomAllocationService {
	public int save(RoomAllocationDetail allocationDetail) {
		   RoomAllocationRepository repo = new RoomAllocationRepository();
		   return repo.save(allocationDetail);   
	   }
	   public List<RoomAllocationDetail> getAll() {
		   RoomAllocationRepository repo = new RoomAllocationRepository();
		  return repo.findAll();  
	   }
	   public int delete(String enrollmentNo) {
		   RoomAllocationRepository repo = new RoomAllocationRepository();
		  return repo.delete(enrollmentNo) ;
	   }
}
