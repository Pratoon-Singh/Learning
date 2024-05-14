package exercise;

import java.util.List;

public class Exercise04 {
	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API" ,
				"Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
		courseWith4OrMoreChar(courses);
	}

	private static void courseWith4OrMoreChar(List<String> courses) {
		courses.stream()
				.filter(course->course.length()>=4)
				.forEach(System.out::println);
	}
}
