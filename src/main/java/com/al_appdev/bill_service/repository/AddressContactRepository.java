package com.al_appdev.bill_service.repository;

import com.al_appdev.bill_service.model.AddressContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressContactRepository extends JpaRepository<AddressContactEntity, UUID> {}