package com.sk.magicaldrops.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {
    @Override
    public boolean validteOtp(String otp, String phoneNumber) {
        return false;
    }

    @Override
    public boolean validteAddress(String phoneNumber, String address) {
        return false;
    }

    @Override
    public boolean validateOrderPlacement(String phoneNumber, String orderId) {
        return false;
    }
}
