package com.wallet.payment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {
    private String transactionType;
    private String transactionID;
    private String status;
    private Date transactionTime;
}
