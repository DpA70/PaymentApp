package com.wallet.payment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String address;
    private Long bankAccountNumber;
}
