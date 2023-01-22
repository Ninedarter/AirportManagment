package entity;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
@JsonTypeName("passenger")
public class Passenger extends Person {

    private String nationality;

    public class Animal {
        // properties and methods
    }


}
