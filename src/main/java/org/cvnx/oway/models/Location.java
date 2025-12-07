package org.cvnx.oway.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "locations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String township;

    private String region;

    private String road;

    private String street;

    private String city;

    private String lat;

    private String lon;

    @OneToMany(mappedBy = "location")
    private Set<Driver> driver;

}
