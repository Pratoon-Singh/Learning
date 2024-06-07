package jpa.jpa_learn;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jpa.jpa_learn.model.Person;
import jpa.jpa_learn.repository.PersonJpaRepositories;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;


@SpringBootTest
class JpaLearnApplicationTests {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJpaRepositories repositories;

	@Autowired
	EntityManager entityManager;

	@Test
	@DirtiesContext
	public void testPlay(){
		repositories.playWithEntityManager();

	}

	@Test
	public void jpqlTest_basic(){
		List personP = entityManager.createQuery("Select p from Person p").getResultList();
		logger.info("JPQL Basic  {}", personP);
	}

	@Test
	public void jpqlTest_Typed(){
		TypedQuery<Person> personP = entityManager.createQuery("Select p from Person p where name like 'Cheko'", Person.class);
		List<Person> resultList = personP.getResultList();
		logger.info("JPQL  Typed{}", resultList);
	}
}
