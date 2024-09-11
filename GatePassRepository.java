package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.GatePassDetail;

import com.jdbc.JdbcUtill;

public class GatePassRepository {
	public int save(GatePassDetail gatePassDetail) {
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "insert into gatepass_detail values(?,?,?,?,?)";
		int count=0;
		PreparedStatement ps = null;
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,gatePassDetail.getStudentname());
			ps.setString(2,gatePassDetail.getmobileNo());
			
			ps.setString(3,gatePassDetail.getpurpose());
			ps.setString(4,gatePassDetail.getDepaturetime());
			ps.setString(5,gatePassDetail.getreturntime());
			
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
	public List<GatePassDetail>findAll(){
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "select * from gatepass_detail";
		Statement st =null;
		 List<GatePassDetail> list=new ArrayList<>();
		try {
			st=con.createStatement();
			ResultSet rs = st.executeQuery(sql);
	    while(rs.next()) {
	    	   GatePassDetail rd = new GatePassDetail();
	    	   rd.setStudentName(rs.getString("Student Name"));
	    	   rd.setmobileNo(rs.getString(" Mobile No."));
	    	  
	    	   rd.setpurpose(rs.getString("purpose"));
	    	   rd.setDepaturetime(rs.getString("Depaturetime "));
	    	   rd.setreturntime(rs.getString("Returntime"));
	    	  
	    	   list.add(rd);
	    	   
	    }
		} catch(SQLException e) {
	    	
	    }finally {
	    	JdbcUtill.cleanResources(st, con);
	    }
	    return list;
		}
	}
	


