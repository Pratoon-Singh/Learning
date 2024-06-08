package jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Reviews {
    @Id
    @Generated
    int id;
    int rating;
    String description;
}
