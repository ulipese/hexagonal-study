package com.ulipese.hexagonalstudy.adapters.outbound.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountJpaRepository extends JpaRepository<AccountJpaEntity, String> {
}
