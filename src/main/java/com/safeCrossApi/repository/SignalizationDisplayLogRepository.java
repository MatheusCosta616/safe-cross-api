package com.safeCrossApi.repository;

import com.safeCrossApi.model.SignalizationDisplayLogModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignalizationDisplayLogRepository extends JpaRepository<SignalizationDisplayLogModel, Long> {
}
