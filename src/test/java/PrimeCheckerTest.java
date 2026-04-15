package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {
    @Test
    void testStatementCoverage() {
        PrimeChecker checker = new PrimeChecker();
        // Bao phủ dòng return false đầu tiên
        assertFalse(checker.isPrime(1));
        // Bao phủ dòng return false trong vòng lặp
        assertFalse(checker.isPrime(4));
        // Bao phủ dòng return true cuối cùng
        assertTrue(checker.isPrime(7));
    }
}