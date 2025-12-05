package org.cvnx.oway.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cvnx.oway.utils.DestinationStatus;
import org.cvnx.oway.utils.DriverStatus;

import java.time.LocalDateTime;

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


}
