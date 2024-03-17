package com.wallet.payment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Wallet {
    private Long bankAccountNumber;
    private Long transactionID;
    private Double balance;
}
