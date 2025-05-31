package com.safeCrossApi.controller;

import com.safeCrossApi.dto.NotificationSentRequestDTO;
import com.safeCrossApi.dto.NotificationSentResponseDTO;
import com.safeCrossApi.service.NotificationSentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/safecross/v1/notifications")
public class NotificationSentController {

    @Autowired
    private NotificationSentService notificationSentService;

    @GetMapping
    public ResponseEntity<List<NotificationSentResponseDTO>> listNotifications(@RequestParam Long userId) {
        return ResponseEntity.ok(notificationSentService.listNotificationsForUser(userId));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAllNotifications(@RequestParam Long userId) {
        notificationSentService.deleteAllNotificationsForUser(userId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/send")
    public ResponseEntity<NotificationSentResponseDTO> sendNotification(@RequestBody NotificationSentRequestDTO dto) {
        NotificationSentResponseDTO responseDTO = notificationSentService.sendNotification(dto);
        return ResponseEntity.ok(responseDTO);
    }
}