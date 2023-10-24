package br.com.thiago.firststepswithspringboot.controllers;

import br.com.thiago.firststepswithspringboot.exceptions.UnsupportedMathOperationException;
import br.com.thiago.firststepswithspringboot.service.CalculatorService;
import br.com.thiago.firststepswithspringboot.utils.NumberUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @RequestMapping(value = "/sum/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    public Double sum(
            @PathVariable(value = "firstNumber") String firstNumber,
            @PathVariable(value = "secondNumber") String secondNumber
    ) {
        return CalculatorService.sum(firstNumber, secondNumber);
    }

    @RequestMapping(value = "/subtract/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    public Double subtract(
            @PathVariable(value = "firstNumber") String firstNumber,
            @PathVariable(value = "secondNumber") String secondNumber
    ) {
        return CalculatorService.subtract(firstNumber, secondNumber);
    }

    @RequestMapping(value = "/multiply/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    public Double multiply(
            @PathVariable(value = "firstNumber") String firstNumber,
            @PathVariable(value = "secondNumber") String secondNumber
    ) {
        return CalculatorService.multiply(firstNumber, secondNumber);
    }

    @RequestMapping(value = "/divide/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    public Double divide(
            @PathVariable(value = "firstNumber") String firstNumber,
            @PathVariable(value = "secondNumber") String secondNumber
    ) {
        return CalculatorService.divide(firstNumber, secondNumber);
    }

    @RequestMapping(value = "/mean/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    public Double mean(
            @PathVariable(value = "firstNumber") String firstNumber,
            @PathVariable(value = "secondNumber") String secondNumber
    ) {
        return CalculatorService.mean(firstNumber, secondNumber);
    }

    @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
    public Double squareRoot(
            @PathVariable(value = "number") String number
    ) {
        return CalculatorService.squareRoot(number);
    }
}
