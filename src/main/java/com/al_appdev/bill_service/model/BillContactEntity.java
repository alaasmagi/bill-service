package com.al_appdev.bill_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "bill_contact")
public class BillContactEntity extends BaseEntity {
    @ManyToOne(optional = false)
    @JoinColumn(name = "bill_id")
    private BillEntity bill;

    @ManyToOne(optional = false)
    @JoinColumn(name = "contact_id")
    private ContactEntity contact;

    @Column(nullable = false)
    private Float sum;

    @Column(nullable = false)
    private Boolean sent;

    @Column(nullable = false)
    private Boolean paid;
}
