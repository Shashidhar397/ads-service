package com.moveoutsale.adsservice.models.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @author shashidhar
 */
@Entity
@Table(name = "ad")
@Data
public class AdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String title;
    private String description;

    @Column(name = "title_image")
    private String titleImage;
    private Long price;

    @CreationTimestamp
    @Column(name = "created_time", nullable = false)
    private Date createdTime;

    @UpdateTimestamp
    @Column(name = "updated_time")
    private Date updatedTime;

    @OneToOne
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @OneToOne
    @JoinColumn(name = "status_id")
    private StatusEntity status;

    private String uuid;
}
