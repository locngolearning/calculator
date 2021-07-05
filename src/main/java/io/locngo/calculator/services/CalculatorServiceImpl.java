package io.locngo.calculator.services;

import org.springframework.stereotype.Component;

@Component
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
