package entity;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.cache.spi.access.AccessType;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Passenger.class, name = "passenger"),
        @JsonSubTypes.Type(value = Pilot.class, name = "pilot")
})
@JsonTypeName("person")
@MappedSuperclass

public  class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String firstName;
    private String lastName;
//
//    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "lastName")
//    @JsonSubTypes({
//            @JsonSubTypes.Type(value = Passenger.class, name = "dog"),
//            @JsonSubTypes.Type(value = Pilot.class, name = "cat")
//    })




}
