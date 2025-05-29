package com.safeCrossApi.controller;

import com.safeCrossApi.dto.ModeledSemaphoreRequestDTO;
import com.safeCrossApi.dto.ModeledSemaphoreResponseDTO;
import com.safeCrossApi.service.SemaphoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/safecross/v1/semaphores")
public class SemaphoreController {
    @Autowired
    private SemaphoreService semaphoreService;

    @PostMapping("/find")
    public ResponseEntity<ModeledSemaphoreResponseDTO> findByCoordinates(@RequestBody ModeledSemaphoreRequestDTO requestDTO) {
        ModeledSemaphoreResponseDTO response = semaphoreService.findByLatitudeAndLongitude(requestDTO);
        if (response == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ModeledSemaphoreResponseDTO findySemaphoreById(@PathVariable Long id){
        return semaphoreService.findSemaphoreById(id);
    }
}
