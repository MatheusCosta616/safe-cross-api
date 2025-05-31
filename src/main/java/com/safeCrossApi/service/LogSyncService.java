package com.safeCrossApi.service;

import com.safeCrossApi.dto.LogSyncRequestDTO;
import com.safeCrossApi.dto.LogSyncResponseDTO;

public interface LogSyncService {
    LogSyncResponseDTO saveSyncLog(LogSyncRequestDTO dto);
}