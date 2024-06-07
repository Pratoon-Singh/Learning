package jpa.jpa_learn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NamedQuery(name = "find_all",query = "select p from Person p")// Person is enity class this is JPQL
public class Person {

    @Id
    @Generated
    int id;
    String name;
    String location;

    public Person(String name, String location){
        this.name = name;
        this.location = location;
    }
}
