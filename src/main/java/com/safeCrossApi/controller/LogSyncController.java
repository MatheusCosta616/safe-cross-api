package com.safeCrossApi.controller;

import com.safeCrossApi.dto.LogSyncRequestDTO;
import com.safeCrossApi.dto.LogSyncResponseDTO;
import com.safeCrossApi.service.LogSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/safecross/v1/log-sync")
public class LogSyncController {

    @Autowired
    private LogSyncService logSyncService;

    @PostMapping
    public ResponseEntity<LogSyncResponseDTO> postSyncLog(@RequestBody LogSyncRequestDTO dto) {
        LogSyncResponseDTO response = logSyncService.saveSyncLog(dto);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<LogSyncResponseDTO>> getAllSyncLogs(@PathVariable Long userId) {
        List<LogSyncResponseDTO> logs = logSyncService.listSyncLogsForUser(userId);
        return ResponseEntity.ok(logs);
    }
}