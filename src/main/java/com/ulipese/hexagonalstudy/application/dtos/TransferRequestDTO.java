package com.ulipese.hexagonalstudy.application.dtos;

import java.math.BigDecimal;

public record TransferRequestDTO(String fromId, String toId, BigDecimal amount) {
}
