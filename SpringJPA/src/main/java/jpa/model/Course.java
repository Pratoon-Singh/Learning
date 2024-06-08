package jpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    @Column(name = "created_date")
    Timestamp createdDate;
    @Column(name = "updated_date")
    Timestamp LastUpdatedDate;
}
