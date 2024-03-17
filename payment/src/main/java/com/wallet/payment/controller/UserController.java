package com.wallet.payment.controller;

import lombok.*;

import javax.annotation.processing.Generated;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserController {
    private String phoneNumber;
    private String firstName;
    private String lastName;
    private String address;
    private Long bankAccountNumber;

}
