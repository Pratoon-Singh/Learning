package jpa;

import jakarta.persistence.EntityManager;
import jpa.repos.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {
	@Autowired
	CourseRepo courseRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		courseRepo.insertInCourse();
		courseRepo.insertInPassport();
		courseRepo.insertInStudent();
		courseRepo.insertInReviews();
	}
}
