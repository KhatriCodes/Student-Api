package com.student.api.pro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentCOntroller {
	
	@Autowired
	Student_Service student_Service;
	
	
	
	@RequestMapping("/AllStudent")
	public List<Student> getAllStudent()
	{
		return student_Service.getAllStudent();
	}

	@RequestMapping("/onestudent/{RollNo}")
	public Student getStudentById(@PathVariable int RollNo)
	{
		return student_Service.getStudentById(RollNo);
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/addstudent")
	public void addTopic(@RequestBody Student student)
	{
		student_Service.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value="/updatestudent/{RollNo}")
	public void addTopic(@PathVariable int RollNo ,@RequestBody Student student)
	{
		student_Service.updateStudent(RollNo, student);
	}
	
	@RequestMapping(method=RequestMethod.DELETE , value="/deletestudent/{RollNo}")
	public void addTopic(@PathVariable int RollNo)
	{
		student_Service.deleteStudent(RollNo);
	}
	
}
