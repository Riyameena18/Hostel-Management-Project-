package com.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.dto.StudentDetail;
import com.jdbc.JdbcUtill;

public class StudentRepository {
	public StudentDetail fetchLoginDetail(StudentDetail studentDetail) {
		Connection con =JdbcUtill.getMySqlConnection();
		String sql = "select * from registration_detail where StudentName=? , StudentMobileNo =? and Password=?";
		StudentDetail result=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1,studentDetail.getUsername());
			ps.setString(2,studentDetail.mobileNo());
			ps.setString(3,studentDetail.getPassword());
			rs=ps.executeQuery();
			rs.next();
			result = new StudentDetail();
			System.out.println(rs.getString(1));
			result.setUsername(rs.getString(1));
			result.setmobileNo(rs.getString(2));
			result.setPassword(rs.getString(3));
			return result;
		}
		catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Something went wrong while fetching data ");
			return result;
		}
		finally {
			JdbcUtill.cleanResources(ps, con, rs);
		}
	}
 
}
