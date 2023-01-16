package com.masai;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "person_service")
public class PersonService {
	
	@Autowired
	@Qualifier(value = "personGym_map")
	private Map<Person, Gym>  theMap;
	
	@Autowired
	@Qualifier(value = "person_list")
	private List<Person> theList;
	
	@Value("${app.name}")
	private String appName;
	
	
	public void printMap() {
		
		Set<Map.Entry<Person, Gym>> set = theMap.entrySet();
		
		for(Map.Entry<Person, Gym> element : set) {
			System.out.println(element.getKey()+ " --> "+element.getValue());
		}
		
		System.out.println("*************************************************************");
	}
	
	
	public void printList(){
		
		Collections.sort(theList,(a,b) -> {
			return (a.getAge() > b.getAge()) ? 1 : -1;
		});
		
		theList.forEach(p -> System.out.println(p));
		
		System.out.println("*************************************************************");
	}
	
	public void printAppName(){
		System.out.println("Printed Application Name is : " +appName);
	}
	

}













