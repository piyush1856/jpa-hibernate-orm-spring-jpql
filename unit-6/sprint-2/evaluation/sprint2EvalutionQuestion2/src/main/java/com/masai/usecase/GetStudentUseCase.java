package com.masai.usecase;

import java.util.Scanner;

import com.masai.CourseDao;
import com.masai.CourseDaoImplementation;
import com.masai.StudentNotFoundException;

public class GetStudentUseCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll");
		int roll = sc.nextInt();
		
		CourseDao dao = new CourseDaoImplementation();
		try {
			dao.getStudent(roll);
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
