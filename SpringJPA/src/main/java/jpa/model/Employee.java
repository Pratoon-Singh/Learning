package jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;
    private String identifier;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

}
