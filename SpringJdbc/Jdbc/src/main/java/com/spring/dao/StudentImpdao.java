package com.spring.dao;



import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.entities.Student;

public class StudentImpdao implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
String query="insert into Student(id,name,city) values(?,?,?)";
int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
		// TODO Auto-generated method stub
		
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int update(Student student) {
	String query="update student set name=?,city=? where id=?";
	int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(int studentid) 
	{
		// TODO Auto-generated method stub
		String query="delete from student where id=?";
		int r=this.jdbcTemplate.update(query,studentid);
	
		return r;
	}
	public Student getStudent(int studentid) {
		// TODO Auto-generated method stub
		String query="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperimpl();
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentid);
		return student;
	}
	public List<Student> GetAllStudent() {
		String query="select*from student";
	List<Student> student=this.jdbcTemplate.query(query, new RowMapperimpl());
		return student;
	}
	


}
