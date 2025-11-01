package com.ulipese.hexagonalstudy.infrastructure.adapters.outbound.persistence;

import com.ulipese.hexagonalstudy.domain.entities.Account;
import com.ulipese.hexagonalstudy.domain.ports.outbound.repositories.AccountRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AccountRepositoryImpl implements AccountRepository {

    private final AccountJpaRepository accountJpaRepository;

    public AccountRepositoryImpl(AccountJpaRepository accountJpaRepository) {
        this.accountJpaRepository = accountJpaRepository;
    }

    @Override
    public Optional<Account> findById(String id) {
        return accountJpaRepository.findById(id).map(acc -> new Account(acc.getId(), acc.getBalance()));
    }

    @Override
    public void save(Account account) {
        AccountJpaEntity accountJpaEntity = new AccountJpaEntity(account.getId(), account.getBalance());
        accountJpaRepository.save(accountJpaEntity);
    }
}
