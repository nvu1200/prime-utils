package com.example;

public class PrimeChecker {
    public boolean isPrime(int number) {
        // 1. Lệnh rẽ nhánh
        if (number <= 1) {
            return false;
        }

        // 2. Vòng lặp
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // Lệnh rẽ nhánh trong vòng lặp
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}