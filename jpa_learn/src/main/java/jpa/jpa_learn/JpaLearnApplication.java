package jpa.jpa_learn;

import jpa.jpa_learn.model.Person;
import jpa.jpa_learn.repository.PersonJdbcDao;
import jpa.jpa_learn.repository.PersonJpaRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaLearnApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(JpaLearnApplication.class);
	@Autowired
	PersonJdbcDao dao;
	@Autowired
	PersonJpaRepositories personJpaRepositories;
	public static void main(String[] args) {
		SpringApplication.run(JpaLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Find all from PersonJdbcDao {} ",dao.findAll());
		logger.info("Find person 3 from PersonJdbcDao {} ",dao.findById(3));
		logger.info("Delete person 3 from PersonJdbcDao Number of Rows Affected {} ",dao.deleteById(3));
		logger.info("Insert person 3 from PersonJdbcDao Number of Rows Affected {} ",dao.insert(new Person(3,"Madan","New York")));
		logger.info("Update person 1 from Person table Number of Rows Affected {} ",dao.update(new Person(1,"Srinivas","Idli")));
		logger.info("___________JPA___________________");
		logger.info("Get by id using JPA{}",personJpaRepositories.getById(3));
		logger.info("Insert person 4 from Person table {} ",
				personJpaRepositories.update(new Person(4,"Srinivas","Idli")));
		logger.info("Update person 3 from Person table {} ",
				personJpaRepositories.update(new Person(3,"Francis","Mexico")));
		personJpaRepositories.deleteById(4);
		logger.info("Find All {}",personJpaRepositories.getAll());
		personJpaRepositories.playWithEntityManager();
	}
}
