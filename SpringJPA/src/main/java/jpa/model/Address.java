package jpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private Integer id;
    private String streetName;
    private String HouseNo;
    private String pincode;
}
