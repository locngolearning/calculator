package io.locngo.calculator.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void testSum() {
        assertEquals(5, calculatorService.sum(2, 3));
    }
}