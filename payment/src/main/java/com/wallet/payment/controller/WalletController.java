package com.wallet.payment.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WalletController {
    private Long bankAccountNumber;
    private Long transactionID;
    private Double balance;
}
