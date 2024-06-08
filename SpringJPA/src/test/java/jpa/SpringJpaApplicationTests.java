package jpa;

import jakarta.persistence.EntityManager;
import jpa.model.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJpaApplicationTests {

	@Autowired
	EntityManager entityManager;
	@Test
	void contextLoads() {
	}

	@Test
	public void insert(){
		entityManager.createNativeQuery("insert into course(id,name,created_date,updated_date) values(1,'JPA',CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP())", Course.class);
	}

}
