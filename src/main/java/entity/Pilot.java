package entity;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@JsonTypeName("pilots")

public class Pilot extends Person {


    private int yearsOfExperience;
    private int totalFlights;


    @ManyToOne
    @JoinColumn(name = "aircraft_id")

    private  Aircraft aircraft;
}
