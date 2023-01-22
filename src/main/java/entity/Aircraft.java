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
    private int capacity;
    private int maxDistance;

    @OneToMany(mappedBy ="aircraft", cascade = CascadeType.ALL)
    private List<Pilot> pilots ;


}
