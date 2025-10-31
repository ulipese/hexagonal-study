package com.ulipese.hexagonalstudy.application.usecases;

import com.ulipese.hexagonalstudy.domain.entities.Account;
import com.ulipese.hexagonalstudy.domain.ports.inbound.usecases.TransferUseCase;
import com.ulipese.hexagonalstudy.domain.ports.outbound.repositories.AccountRepository;

import java.math.BigDecimal;

public class TransferServiceImpl implements TransferUseCase {
    private final AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transfer(String fromId, String toId, BigDecimal amount) {
        Account from = accountRepository.findById(fromId).orElseThrow();
        Account to = accountRepository.findById(toId).orElseThrow();
        from.transfer(to, amount);

        accountRepository.save(from);
        accountRepository.save(to);
    }
}
