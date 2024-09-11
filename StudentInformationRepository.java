package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.StudentInformation;
import com.jdbc.JdbcUtill;

public class StudentInformationRepository {
	public int save(StudentInformation informationDetail) {
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "insert into informatiojn_detail values(?,?)";
		int count=0;
		PreparedStatement ps = null;
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,informationDetail.getStudentname());
			ps.setString(2,informationDetail.getstudentRoomNumber());
	
			
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
	public List<StudentInformation>findAll(){
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "select * from information_detail";
		Statement st =null;
		 List<StudentInformation> list=new ArrayList<>();
		try {
			st=con.createStatement();
			ResultSet rs = st.executeQuery(sql);
	    while(rs.next()) {
	    	   StudentInformation rd = new StudentInformation();
	    	   rd.setStudentname(rs.getString("Studentname"));
	    	  
	    	   rd.setstudentRoomNumber(rs.getString("studentRoomNumber"));
	    	   
	    	  
	    	   list.add(rd);
	    	   
	    }
		} catch(SQLException e) {
	    	
	    }finally {
	    	JdbcUtill.cleanResources(st, con);
	    }
	    return list;
		}
	}
	


