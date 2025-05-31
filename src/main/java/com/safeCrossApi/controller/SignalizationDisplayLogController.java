package com.safeCrossApi.controller;

import com.safeCrossApi.dto.SignalizationDisplayLogRequestDTO;
import com.safeCrossApi.dto.SignalizationDisplayLogResponseDTO;
import com.safeCrossApi.service.SignalizationDisplayLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/safecross/v1/logs/sinalization")
public class SignalizationDisplayLogController {

    @Autowired
    private SignalizationDisplayLogService signalizationDisplayLogService;

    @GetMapping
    public ResponseEntity<List<SignalizationDisplayLogResponseDTO>> listLogs(@RequestParam Long userId) {
        return ResponseEntity.ok(signalizationDisplayLogService.listLogsForUser(userId));
    }

    @PostMapping
    public ResponseEntity<SignalizationDisplayLogResponseDTO> createLog(@RequestBody SignalizationDisplayLogRequestDTO dto) {
        SignalizationDisplayLogResponseDTO response = signalizationDisplayLogService.createLog(dto);
        return ResponseEntity.ok(response);
    }
}