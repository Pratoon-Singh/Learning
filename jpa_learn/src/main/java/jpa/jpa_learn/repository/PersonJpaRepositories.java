package jpa.jpa_learn.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jpa.jpa_learn.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class PersonJpaRepositories {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getAll() {
        TypedQuery<Person> findAll = entityManager.createNamedQuery("find_all", Person.class);
        return findAll.getResultList();
    }

    public Person getById(int id) {
        return entityManager.find(Person.class, id);
    }

    public Person insert(Person person) {
        if (person.getId() == 0) {
            entityManager.persist(person);
        }
        return person;
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    public void deleteById(int id) {
        Person person = getById(id);
        entityManager.remove(person);
    }

    public void playWithEntityManager() {
        Person person = new Person(1001, "Yod", "China");
        entityManager.persist(person);
        Person person2 = new Person(1002, "Sergi", "Russia");
        entityManager.persist(person2);
        entityManager.flush();

//        entityManager.detach(person2);
//        entityManager.detach(person);
        //entityManager.clear();// if you have to detach each and everytime you can use clear it will clear out
        // everything in the entity manager



        person.setName("Yee");
        person2.setName("Cheko");// It will change the name Yod to Yee because the class is transactional.
        // It continues till its completed.

        entityManager.refresh(person); // when this is run it refreshes the changes nad and it does not
        // persists in the database ` person.setName("Yee");` is refreshed and it stays yod only.
        entityManager.flush();
    }


}

