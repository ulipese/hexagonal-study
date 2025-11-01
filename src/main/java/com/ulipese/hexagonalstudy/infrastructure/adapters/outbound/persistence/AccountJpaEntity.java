package com.ulipese.hexagonalstudy.infrastructure.adapters.outbound.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Entity
public class AccountJpaEntity {
    @Id
    private String id;

    private BigDecimal balance;

    public AccountJpaEntity() {
    }

    public AccountJpaEntity(String id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

}
