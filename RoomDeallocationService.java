package com.service;

import java.util.List;

import com.dto.RoomDeallocationDetail;

import com.repository.RoomDeallocationRepository;

public class RoomDeallocationService {
	public int save(RoomDeallocationDetail deallocationDetail) {
		   RoomDeallocationRepository drepo = new RoomDeallocationRepository();
		   return drepo.save(deallocationDetail);   
	   }
	   public List<RoomDeallocationDetail> getAll() {
		   RoomDeallocationRepository drepo = new RoomDeallocationRepository();
		  return drepo.findAll();  
	   }
}
