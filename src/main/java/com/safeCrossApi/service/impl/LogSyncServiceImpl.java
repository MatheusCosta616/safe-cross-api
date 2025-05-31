package com.safeCrossApi.service.impl;

import com.safeCrossApi.dto.LogSyncRequestDTO;
import com.safeCrossApi.dto.LogSyncResponseDTO;
import com.safeCrossApi.model.LogSyncModel;
import com.safeCrossApi.model.UserModel;
import com.safeCrossApi.repository.LogSyncRepository;
import com.safeCrossApi.repository.UserRepository;
import com.safeCrossApi.service.LogSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LogSyncServiceImpl implements LogSyncService {

    @Autowired
    private LogSyncRepository logSyncRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public LogSyncResponseDTO saveSyncLog(LogSyncRequestDTO dto) {
        UserModel user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        LogSyncModel log = new LogSyncModel();
        log.setUser(user);
        log.setSyncDateTime(LocalDateTime.now());
        log.setExchangedRecordsCount(dto.getExchangedRecordsCount());

        LogSyncModel saved = logSyncRepository.save(log);

        return new LogSyncResponseDTO(
                saved.getId(),
                saved.getUser().getId(),
                saved.getSyncDateTime(),
                saved.getExchangedRecordsCount()
        );
    }
}