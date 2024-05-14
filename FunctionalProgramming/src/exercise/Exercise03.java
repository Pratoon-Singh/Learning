package exercise;

import java.util.List;

public class Exercise03 {
	/*
	Print Courses Containing the word "Spring"
	 */
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" ,
				"Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		courseWithSpring(courses);
	}

	private static void courseWithSpring(List<String> courses) {
		courses.stream()
				.filter(course->course.contains("Spring"))
				.forEach(System.out::println);
	}
}
