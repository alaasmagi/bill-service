package com.al_appdev.bill_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "bills")
public class BillEntity extends BaseEntity {
    @ManyToOne(optional = false)
    @JoinColumn(name = "service_id")
    private ServiceEntity service;

    @ManyToOne(optional = false)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @Column(nullable = false)
    private Float totalSum;

    @Column(nullable = false)
    private LocalDate date;
}