package jpa.jpa_learn.model;

import lombok.Data;

@Data
public class MyModel {
    int id ;
    String name ;
    String description;

    public MyModel(int id, String name, String description){
        this.id=id;
        this.name=name;
        this.description=description;
    }
}
