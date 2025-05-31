package com.safeCrossApi.controller;

import com.safeCrossApi.dto.ComputerVisionLogRequestDTO;
import com.safeCrossApi.dto.ComputerVisionLogResponseDTO;
import com.safeCrossApi.service.ComputerVisionLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/safecross/v1/visualization-camera")
public class ComputerVisionLogController {

    @Autowired
    private ComputerVisionLogService computerVisionLogService;

    @PostMapping
    public ResponseEntity<ComputerVisionLogResponseDTO> postCameraVisualization(@RequestBody ComputerVisionLogRequestDTO dto) {
        ComputerVisionLogResponseDTO response = computerVisionLogService.createLog(dto);
        return ResponseEntity.ok(response);
    }
}