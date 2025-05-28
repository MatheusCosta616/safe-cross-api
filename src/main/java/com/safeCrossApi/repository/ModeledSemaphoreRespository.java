package com.safeCrossApi.repository;

import com.safeCrossApi.model.ModeledSemaphoreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeledSemaphoreRespository extends JpaRepository<ModeledSemaphoreModel, Long> {
}
