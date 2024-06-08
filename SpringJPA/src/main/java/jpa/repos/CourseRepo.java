package jpa.repos;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jpa.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@Transactional
public class CourseRepo {

    @Autowired
    EntityManager entityManager;

    public void insertInCourse(){
        entityManager.createNativeQuery("insert into course(id,name,created_date,updated_date) values(1,'JPA',CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP())").executeUpdate();
        entityManager.createNativeQuery("insert into course(id,name,created_date,updated_date) values(2,'AWS',CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP())").executeUpdate();
        entityManager.createNativeQuery("insert into course(id,name,created_date,updated_date) values(3,'Azure',CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP())").executeUpdate();
        entityManager.createNativeQuery("insert into course(id,name,created_date,updated_date) values(4,'Docker',CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP())").executeUpdate();
    }

    public void insertInStudent(){
        entityManager.createNativeQuery("insert into student(id,name,passport_id) values(10,'Adam',100)").executeUpdate();
        entityManager.createNativeQuery("insert into student(id,name,passport_id) values(20,'Eve',200)").executeUpdate();
        entityManager.createNativeQuery("insert into student(id,name,passport_id) values(30,'John',300)").executeUpdate();
        entityManager.createNativeQuery("insert into student(id,name,passport_id) values(40,'David',400)").executeUpdate();
    }

    public void insertInPassport(){
        entityManager.createNativeQuery("insert into passport(id,number) values(100,'100Adam')").executeUpdate();
        entityManager.createNativeQuery("insert into passport(id,number) values(200,'200Eve')").executeUpdate();
        entityManager.createNativeQuery("insert into passport(id,number) values(300,'300John')").executeUpdate();
        entityManager.createNativeQuery("insert into passport(id,number) values(400,'400David')").executeUpdate();
    }

    public void insertInReviews(){
        entityManager.createNativeQuery("insert into reviews(id,rating,description) values(1001,'3','Great')").executeUpdate();
        entityManager.createNativeQuery("insert into reviews(id,rating,description) values(1002,'4','Awesome')").executeUpdate();
        entityManager.createNativeQuery("insert into reviews(id,rating,description) values(1003,'2','Not Good')").executeUpdate();
        entityManager.createNativeQuery("insert into reviews(id,rating,description) values(1004,'3','Okay!')").executeUpdate();
    }
}
