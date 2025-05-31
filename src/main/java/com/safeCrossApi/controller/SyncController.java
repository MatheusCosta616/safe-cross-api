package com.safeCrossApi.controller;

import com.safeCrossApi.dto.SyncRequestDTO;
import com.safeCrossApi.dto.SyncResponseDTO;
import com.safeCrossApi.service.SyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/safecross/v1/logs/sync")
public class SyncController {

    @Autowired
    private SyncService syncService;

    @PostMapping
    public ResponseEntity<SyncResponseDTO> sync(@RequestBody SyncRequestDTO dto) {
        SyncResponseDTO response = syncService.sync(dto);
        return ResponseEntity.ok(response);
    }
}