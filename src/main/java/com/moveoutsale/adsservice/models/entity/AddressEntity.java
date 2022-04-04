package com.moveoutsale.adsservice.models.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author shashidhar
 */
@Entity
@Table(name = "address")
@Data
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "address_line1", nullable = false)
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;
    private String city;
    private String district;
    private String state;
    private String country;

    @Column(name = "pin_code")
    private int pinCode;
}
