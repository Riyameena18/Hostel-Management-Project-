package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.dto.RoomAllocationDetail;
import com.jdbc.JdbcUtill;

public class RoomAllocationRepository {
	public int save(RoomAllocationDetail allocationDetail) {
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "insert into roomallocation_detail values(?,?,?,?,?)";
		int count=0;
		PreparedStatement ps = null;
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,allocationDetail.getEnrollmentNo());
			ps.setString(2,allocationDetail.getStudentname());
			ps.setString(3,allocationDetail.getmobileNo());
			ps.setString(4,allocationDetail.getroomnumber());
			ps.setString(5,allocationDetail.getcheckindate());
			
			 count = ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtill.cleanResources(ps, con);
		}
		return count;
	}
	public int delete(String enrollmentNo) {
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "delete from roomallocation_detail where EnrollmentNo=?";
		int count=0;
		PreparedStatement ps = null;
		System.out.println("delete");
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,enrollmentNo);
			
			
			 count = ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtill.cleanResources(ps, con);
		}
		return count;
	}
	public List<RoomAllocationDetail>findAll(){
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "select * from roomallocation_detail";
		Statement st =null;
		 List<RoomAllocationDetail> list=new ArrayList<>();
		try {
			st=con.createStatement();
			ResultSet rs = st.executeQuery(sql);
	    while(rs.next()) {
	    	   RoomAllocationDetail rd = new RoomAllocationDetail();
	    	   rd.setStudentName(rs.getString("Student Name"));
	    	   rd.setmobileNo(rs.getString(" Mobile No."));
	    	   rd.setroomnumber(rs.getString("Room Number"));
	    	   rd.setcheckindate(rs.getString("Check In Date "));
	    	  
	    	   list.add(rd);
	    	   
	    }
		} catch(SQLException e) {
	    	
	    }finally {
	    	JdbcUtill.cleanResources(st, con);
	    }
	    return list;
		}
	}
	

