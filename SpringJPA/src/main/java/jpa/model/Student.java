package jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    int id;
    String name;
    @OneToOne
    private Passport passport;
}
