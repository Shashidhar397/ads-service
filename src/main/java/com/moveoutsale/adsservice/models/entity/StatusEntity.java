package com.moveoutsale.adsservice.models.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author shashidhar
 */
@Entity
@Table(name = "status")
@Data
public class StatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private int code;
    private String text;
}
