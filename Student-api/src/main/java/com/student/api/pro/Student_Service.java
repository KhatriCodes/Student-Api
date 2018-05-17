package com.student.api.pro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Student_Service {

	@Autowired
	Student_Repository  student_Repository;
	
	public List<Student> getAllStudent()
	{
		List<Student> student = new ArrayList<>();
		student_Repository.findAll()
		.forEach(student::add);
		return student;
		
	}
	
	public Student getStudentById(int RollNo)
	{
		List<Student> student = new ArrayList<>();
		return student_Repository.findOne(RollNo);
		
	}
	
	public void addStudent(Student student)
	{
		student_Repository.save(student);
	}
	
	public void updateStudent(int id , Student student)
	{
		student_Repository.save(student);
	}
	
	public void deleteStudent(int RollNo)
	{
		student_Repository.delete(RollNo);
	}
	
	
}
