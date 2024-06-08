package jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Passport {
    @Id
    @Generated
    int id;
    String number;
}
