package io.locngo.calculator.services;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    int sum(int a, int b);
}
