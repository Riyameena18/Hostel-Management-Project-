package com.repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dto.RegistrationDetail;
import com.jdbc.JdbcUtill;

	public class RegistrationRepository {
		public int save(RegistrationDetail regDetail) {
			Connection con =JdbcUtill.getMySqlConnection();
			String sql = "insert into registration_detail values(?,?,?,?,?,?,?,?,?,?,?)";
			int count=0;
			PreparedStatement ps = null;
			
			try {
				ps=con.prepareStatement(sql);
				ps.setString(1,regDetail.getStudentname());
				ps.setString(2,regDetail.getStudentmobileno());
				ps.setString(3,regDetail.getfathername());
				ps.setString(4,regDetail.getFathermobileno());
				ps.setString(5,regDetail.getBranch());
				ps.setString(6,regDetail.getYear());
				ps.setString(7,regDetail.getStudentEmailid());
				
				
				ps.setString(8,regDetail.getFatherEmailid());
				ps.setString(9,regDetail.getDateofbirth());
				ps.setString(10,regDetail.getAddress());
				ps.setString(11,regDetail.getPassword());
				
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
		public List<RegistrationDetail>findAll(){
			Connection con =JdbcUtill.getMySqlConnection();
			String sql = "select * from registration_detail";
			Statement st =null;
			 List<RegistrationDetail> list=new ArrayList<>();
			try {
				st=con.createStatement();
				ResultSet rs = st.executeQuery(sql);
		    while(rs.next()) {
		    	   RegistrationDetail rd = new RegistrationDetail();
		    	   rd.setStudentName(rs.getString("Student Name"));
		    	   rd.setStudentmobileno(rs.getString("Student Mobile no."));
		    	   rd.setfathername(rs.getString("Father Name"));
		    	   rd.setFathermobileno(rs.getString("Father Mobile no."));
		    	   rd.setBranch(rs.getString("Branch"));
		    	   rd.setYear(rs.getString("Year"));
		    	   rd.setStudentEmailid(rs.getString("StudentEmailId"));
		    	   rd.setStudentEmailid(rs.getString("FatherEmailId"));
		    	   rd.setDateofbirth(rs.getString("Date Of birth"));
		    	   rd.setAddress(rs.getString("Address"));
		    	   rd.setPassword(rs.getString("Password"));
		    	   list.add(rd);
		    	   
		    }
			} catch(SQLException e) {
		    	
		    }finally {
		    	JdbcUtill.cleanResources(st, con);
		    }
		    return list;
			}
		}
		
	 
	


