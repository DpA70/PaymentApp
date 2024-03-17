package com.wallet.payment.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionController {
    private String transactionType;
    private String transactionID;
    private String status;
    private Date transactionTime;
}
