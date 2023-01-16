package com.masai.service;

import java.util.List;

import com.masai.exceptions.CustomerException;
import com.masai.model.Student;
import com.masai.model.StudentDTO;

public interface StudentService {
	
	public Student registerStudent(Student student);
	
	public Student getStudentByRoll(Integer roll)throws CustomerException;
	
	public List<Student> getAllStudentDetails()throws CustomerException;
	
	public Student deleteStudentByRoll(Integer roll)throws CustomerException;
	
	public Student updateStudentDetails(Student student)throws CustomerException;
	
	public Student updateStudentMarksByRoll(Integer roll,Integer gMarks)throws CustomerException;
	
	public List<Student> getStudentsByAddress(String address)throws CustomerException;
	
	public Student getStudentByMarks(Integer marks)throws CustomerException;
	
	
	public String getStudentNameByRoll(Integer roll)throws CustomerException;
	
	public List<String> getStudentNameAndMarksByAddress(String address)throws CustomerException;
	
	public List<StudentDTO> getStudentNameAndMarksByAddress2(String address)throws CustomerException;
	
	
	
	
}
