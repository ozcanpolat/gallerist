package com.ozcanpolat.gallerist.model;

import com.ozcanpolat.gallerist.enums.CurrencyType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "account", schema = "gallerist")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account  extends BaseEntity{
    @Column(name = "account_no")
    private String accountNo;

    @Column(name = "iban")
    private String iban;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "curreny_type")
    @Enumerated(EnumType.STRING)
    private CurrencyType currencyType;
}
