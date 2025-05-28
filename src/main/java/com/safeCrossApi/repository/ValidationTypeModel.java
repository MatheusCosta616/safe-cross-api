package com.safeCrossApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationTypeModel extends JpaRepository<ValidationTypeModel, Long> {
}
