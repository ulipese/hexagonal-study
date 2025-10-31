package com.ulipese.hexagonalstudy.domain.ports.inbound.usecases;

import java.math.BigDecimal;

public interface TransferUseCase {
    void transfer(String fromId, String toId, BigDecimal amount);
}
