package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.dto.RoomDeallocationDetail;
import com.jdbc.JdbcUtill;

public class RoomDeallocationRepository {
	public int save(RoomDeallocationDetail deallocationDetail) {
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "insert into roomdeallocation_detail values(?,?,?,?)";
		int count=0;
		PreparedStatement ps = null;
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,deallocationDetail.getStudentname());
			ps.setString(2,deallocationDetail.getmobileNo());
			ps.setString(3,deallocationDetail.getroomnumber());
			ps.setString(4,deallocationDetail.getcheckoutdate());
			
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
	public List<RoomDeallocationDetail>findAll(){
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "delete from roomallocation_detail where StudentName=? , MobileNo=?,RoomNumber=?";
		Statement st =null;
		 List<RoomDeallocationDetail> list=new ArrayList<>();
		try {
			st=con.createStatement();
			ResultSet rs = st.executeQuery(sql);
	    while(rs.next()) {
	    	   RoomDeallocationDetail rd = new RoomDeallocationDetail();
	    	   rd.setStudentName(rs.getString("Student Name"));
	    	   rd.setmobileNo(rs.getString(" Mobile No."));
	    	   rd.setroomnumber(rs.getString("Room Number"));
	    	   rd.setcheckoutdate(rs.getString("Check Out Date "));
	    	  
	    	   list.add(rd);
	    	   
	    }
		} catch(SQLException e) {
	    	
	    }finally {
	    	JdbcUtill.cleanResources(st, con);
	    }
	    return list;
		}
}
