package com.sk.magicaldrops.service;

public interface ValidationService {
    public boolean validteOtp(String otp,String phoneNumber);
    public boolean validteAddress(String phoneNumber,String address);
    public boolean validateOrderPlacement(String phoneNumber,String orderId);
}
