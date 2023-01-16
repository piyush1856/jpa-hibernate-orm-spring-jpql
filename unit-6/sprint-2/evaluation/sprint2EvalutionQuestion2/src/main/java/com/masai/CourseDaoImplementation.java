package com.masai;

import java.util.List;

import javax.persistence.EntityManager;

public class CourseDaoImplementation implements CourseDao{

	public void addCourse(Course course) {
		
		
		EntityManager em = EMUtility.provideEntityManager();
		
		
		
		Student s1 = new Student();
		s1.setName("Piyush");
		s1.setMobile("4568522");
		s1.setEmail("p@g");
		s1.setCouse(course);
		
		Student s2 = new Student();
		s2.setName("Tyagi");
		s2.setMobile("5558522");
		s2.setEmail("t@g");
		s2.setCouse(course);
		
		course.getStudList().add(s1);
		course.getStudList().add(s2);
		
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done");
	}

	public void getStudent(int roll_no) throws StudentNotFoundException {
		
		EntityManager em = EMUtility.provideEntityManager();
		
		try {
			Student s = em.find(Student.class, roll_no);
			
			Course c = s.getCouse();
			
			System.out.println(s.getRollNo());
			System.out.println(s.getName());
			System.out.println(s.getMobile());
			System.out.println(s.getEmail());
			System.out.println(c.getCourseId());
			System.out.println(c.getCourseName());
			System.out.println(c.getDuration());
			System.out.println(c.getFees());
		}catch(Exception e) {
			throw new StudentNotFoundException("Student not found");
		}
	
		em.close();
		
	}

	public void getCourse(int course_id) throws CourseNotFoundException {
		EntityManager em = EMUtility.provideEntityManager();
		try {
			
			Course c = em.find(Course.class, course_id);
			List<Student> studList = c.getStudList();
			
			
			System.out.println(c.getCourseId());
			System.out.println(c.getCourseName());
			System.out.println(c.getDuration());
			System.out.println(c.getFees());
			
			
			studList.forEach(s -> System.out.println(s));
			
			
			
			
			
		} catch (Exception e) {
			throw new CourseNotFoundException(e.getMessage());
		}
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
