package com.gestionit.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deviceId;

    private String name;
    private String deviceType;
    private String marque;
    private String couleur;
    private String details;
    private String assignedTo;

    @Temporal(TemporalType.DATE)
    private Date purchaseDate;
}
