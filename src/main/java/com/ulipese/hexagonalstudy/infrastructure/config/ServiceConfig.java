package com.ulipese.hexagonalstudy.infrastructure.config;

import com.ulipese.hexagonalstudy.application.usecases.TransferServiceImpl;
import com.ulipese.hexagonalstudy.domain.ports.inbound.usecases.TransferUseCase;
import com.ulipese.hexagonalstudy.domain.ports.outbound.repositories.AccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public TransferUseCase transferUseCase(AccountRepository accountRepository) {
        return new TransferServiceImpl(accountRepository);
    }
}
