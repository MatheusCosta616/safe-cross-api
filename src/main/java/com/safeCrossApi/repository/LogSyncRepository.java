package com.safeCrossApi.repository;

import com.safeCrossApi.model.LogSyncModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogSyncRepository extends JpaRepository<LogSyncModel, Long> {
}
