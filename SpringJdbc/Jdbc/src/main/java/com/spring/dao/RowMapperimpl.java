package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.entities.Student;

public class RowMapperimpl implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rownum) throws SQLException {
		// TODO Auto-generated method stub
		Student student =new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		return student;
	}

}
