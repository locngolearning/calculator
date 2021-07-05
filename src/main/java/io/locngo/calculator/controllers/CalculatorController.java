package io.locngo.calculator.controllers;

import io.locngo.calculator.services.CalculatorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping(value = "/sum")
    String sum(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b) {
        return String.valueOf(this.calculatorService.sum(a, b));
    }
}
