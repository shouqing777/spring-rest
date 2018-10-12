package com.shouqing777.spring.restcontroller;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shouqing777.spring.entity.Student;
import com.shouqing777.spring.entity.StudentErrorResponse;
import com.shouqing777.spring.entity.StudentNotFoundException;

/**
* @author shouqing E-mail:shouqing777@gmail.com
* @version 創建時間：2018年8月15日 下午3:16:59
* 類說明
*/

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	@PostConstruct
	public void loadData() {

		this.theStudents = new ArrayList<>();
		
		this.theStudents.add(new Student("tom","michale"));
		this.theStudents.add(new Student("min","michale"));
		this.theStudents.add(new Student("leona","michale"));
		
	}
	
	
	@GetMapping("/students")
	public  List<Student> getStudents(){
		
		System.out.println(theStudents);
		return theStudents;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		if ((studentId>=theStudents.size())||(studentId<0)){
			throw new StudentNotFoundException("Student id not fund - " + studentId);		
		}		
		return theStudents.get(studentId);	
	}
	
}
