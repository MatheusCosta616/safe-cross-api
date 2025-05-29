package com.safeCrossApi.repository;

import com.safeCrossApi.model.AffectedAreaRegisterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AffectedAreaRegisterRepository extends JpaRepository<AffectedAreaRegisterModel, Long> {
}
