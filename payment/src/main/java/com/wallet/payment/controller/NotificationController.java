package com.wallet.payment.controller;

import com.wallet.payment.model.Transaction;
import com.wallet.payment.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class NotificationController {
    private User user;
    private Transaction transaction;
}
