package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.dto.UpdateDetail;
import com.jdbc.JdbcUtill;

public class UpdateRepository {
	public int save(UpdateDetail UpdateDetail) {
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "insert into roomallocation_detail values(?,?,?,?)";
		int count=0;
		PreparedStatement ps = null;
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,UpdateDetail.getday());
			ps.setString(2,UpdateDetail.getmealtime());
			ps.setString(3,UpdateDetail.getmealname());
			
			
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
	public List<UpdateDetail>findAll(){
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "select * from roomallocation_detail";
		Statement st =null;
		 List<UpdateDetail> list=new ArrayList<>();
		try {
			st=con.createStatement();
			ResultSet rs = st.executeQuery(sql);
	    while(rs.next()) {
	    	  UpdateDetail rd = new UpdateDetail();
	    	   rd.setday(rs.getString("day"));
	    	   rd.setmealtime(rs.getString(" mealtime"));
	    	   rd.setmealname(rs.getString("mealname"));
	    	 
	    	  
	    	   list.add(rd);
	    	   
	    }
		} catch(SQLException e) {
	    	
	    }finally {
	    	JdbcUtill.cleanResources(st, con);
	    }
	    return list;
		}
}
