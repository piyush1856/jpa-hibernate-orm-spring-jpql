package com.masai.usecase;

import java.util.Scanner;

import com.masai.CourseDao;
import com.masai.CourseDaoImplementation;
import com.masai.CourseNotFoundException;

public class GetCourseUseCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Course ID");
		int cid = sc.nextInt();
		
		CourseDao dao = new CourseDaoImplementation();
		
		try {
			dao.getCourse(cid);
		} catch (CourseNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
