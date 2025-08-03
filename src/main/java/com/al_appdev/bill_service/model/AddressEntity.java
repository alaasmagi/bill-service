package com.al_appdev.bill_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "addresses")
public class AddressEntity extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false, name = "street_apt")
    private String streetApt;

    @Column(nullable = false)
    private String postal;

    @Column(nullable = false)
    private String city;

    private String county;
    private String country;
}