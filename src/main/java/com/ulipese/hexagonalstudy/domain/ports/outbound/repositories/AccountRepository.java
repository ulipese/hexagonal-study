package com.ulipese.hexagonalstudy.domain.ports.outbound.repositories;

import com.ulipese.hexagonalstudy.domain.entities.Account;

import java.util.Optional;

public interface AccountRepository {
    Optional<Account> findById(String id);

    void save(Account account);
}
