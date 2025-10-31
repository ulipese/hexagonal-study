package com.ulipese.hexagonalstudy.adapters.inbound.api;

import com.ulipese.hexagonalstudy.application.dtos.TransferRequestDTO;
import com.ulipese.hexagonalstudy.domain.ports.inbound.usecases.TransferUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transfer")
public class TransferController {
    private final TransferUseCase transferUseCase;

    public TransferController(TransferUseCase transferUseCase) {
        this.transferUseCase = transferUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> transfer(@RequestBody TransferRequestDTO request) {
        transferUseCase.transfer(request.fromId(), request.toId(), request.amount());
        return ResponseEntity.ok().build();
    }
}
