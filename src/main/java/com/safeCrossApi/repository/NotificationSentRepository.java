package com.safeCrossApi.repository;

import com.safeCrossApi.model.NotificationSentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationSentRepository extends JpaRepository<NotificationSentModel, Long> {
}
