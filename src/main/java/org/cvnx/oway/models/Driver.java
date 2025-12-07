package org.cvnx.oway.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cvnx.oway.utils.DestinationStatus;
import org.cvnx.oway.utils.DriverStatus;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "drivers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String driverLicense;
    private String nrc;
    private String phoneNumber;
    private LocalDateTime dob;
    private String email;
    private String profileImage;
    private String vehicleLicense;
    private String yoe;
    private String address;
    private DriverStatus status;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "driver")
    private Set<Rent> rents;


    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;


}
