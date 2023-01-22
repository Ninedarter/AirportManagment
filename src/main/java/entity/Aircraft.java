package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private Integer capacity;
    private Integer maxDistance;

    @OneToMany(mappedBy ="aircraft", cascade = CascadeType.ALL)
    private List<Pilot> pilots ;

    @OneToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;


}
