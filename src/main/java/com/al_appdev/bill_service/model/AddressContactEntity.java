package com.al_appdev.bill_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "address_contact")
public class AddressContactEntity extends BaseEntity {
    @ManyToOne(optional = false)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @ManyToOne(optional = false)
    @JoinColumn(name = "contact_id")
    private ContactEntity contact;
}