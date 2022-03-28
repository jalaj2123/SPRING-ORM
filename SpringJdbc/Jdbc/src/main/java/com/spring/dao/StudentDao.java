package com.spring.dao;

import com.spring.entities.Student;
import java.util.List;

public interface StudentDao 
{
public int insert(Student student);
public int update(Student student);
public int delete(int studentid);
public Student getStudent(int studentid);
public List<Student> GetAllStudent();
}
