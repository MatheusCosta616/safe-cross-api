package com.safeCrossApi.controller;

import com.safeCrossApi.dto.AffectedAreaRegisterFindByCoordinatesRequestDTO;
import com.safeCrossApi.dto.AffectedAreaRegisterRequestDTO;
import com.safeCrossApi.dto.AffectedAreaRegisterResponseDTO;
import com.safeCrossApi.service.AffectedAreaRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/safecross/v1/affected-areas")
public class AffectedAreasController {
    @Autowired
    private AffectedAreaRegisterService affectedAreaRegisterService;

    @PostMapping()
    public ResponseEntity<AffectedAreaRegisterResponseDTO> register(@RequestBody AffectedAreaRegisterRequestDTO requestDTO) {
        AffectedAreaRegisterResponseDTO responseDTO = affectedAreaRegisterService.register(requestDTO);
        return ResponseEntity.ok(responseDTO);
    }
    @PostMapping("/find-by-coordinates")
    public ResponseEntity<AffectedAreaRegisterResponseDTO> findByCoordinates(@RequestBody AffectedAreaRegisterFindByCoordinatesRequestDTO requestDTO) {
        AffectedAreaRegisterResponseDTO response = affectedAreaRegisterService.findByLatitudeAndLongitude(requestDTO);
        if (response == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(response);
    }
}
