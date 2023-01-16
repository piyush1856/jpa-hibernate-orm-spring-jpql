package com.masai.usecase;

import com.masai.Course;
import com.masai.CourseDao;
import com.masai.CourseDaoImplementation;

public class AddCourseUseCase {
	
	public static void main(String[] args) {
		
		Course java = new Course();
		java.setCourseName("Java");
		java.setDuration(180);
		java.setFees(100000);
		
		CourseDao dao = new CourseDaoImplementation();
		dao.addCourse(java);
		
		
		
		
		
		
	}

}
