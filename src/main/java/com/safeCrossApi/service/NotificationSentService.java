package com.safeCrossApi.service;

import com.safeCrossApi.dto.NotificationSentRequestDTO;
import com.safeCrossApi.dto.NotificationSentResponseDTO;
import java.util.List;

public interface NotificationSentService {
    List<NotificationSentResponseDTO> listNotificationsForUser(Long userId);
    void deleteAllNotificationsForUser(Long userId);
    NotificationSentResponseDTO sendNotification(NotificationSentRequestDTO dto);
}