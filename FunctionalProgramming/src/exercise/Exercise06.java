package exercise;

import java.util.List;

public class Exercise06 {
	/*
	Print the number of characters in each course name
	 */
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" ,
				"Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		courses.stream()
				.map(course->course+ " " +course.length())
				.forEach(System.out::println);
	}
}
