package com.al_appdev.bill_service.repository;

import com.al_appdev.bill_service.model.BillEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BillRepository extends JpaRepository<BillEntity, UUID> {}
