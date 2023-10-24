package br.com.thiago.firststepswithspringboot.service;

import br.com.thiago.firststepswithspringboot.exceptions.UnsupportedMathOperationException;
import br.com.thiago.firststepswithspringboot.utils.NumberUtils;
import org.springframework.web.bind.annotation.PathVariable;

public class CalculatorService {

    public static Double sum(String firstNumber, String secondNumber) {
        if (!NumberUtils.isNumeric(firstNumber) || !NumberUtils.isNumeric(secondNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return  NumberUtils.convertToDouble(firstNumber) + NumberUtils.convertToDouble(secondNumber);
    }

    public static Double subtract(String firstNumber, String secondNumber) {
        if (!NumberUtils.isNumeric(firstNumber) || !NumberUtils.isNumeric(secondNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return  NumberUtils.convertToDouble(firstNumber) - NumberUtils.convertToDouble(secondNumber);
    }

    public static Double multiply(String firstNumber, String secondNumber) {
        if (!NumberUtils.isNumeric(firstNumber) || !NumberUtils.isNumeric(secondNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return  NumberUtils.convertToDouble(firstNumber) * NumberUtils.convertToDouble(secondNumber);
    }

    public static Double divide(String firstNumber, String secondNumber) {
        if (!NumberUtils.isNumeric(firstNumber) || !NumberUtils.isNumeric(secondNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return  NumberUtils.convertToDouble(firstNumber) / NumberUtils.convertToDouble(secondNumber);
    }

    public static Double mean(String firstNumber, String secondNumber) {
        if (!NumberUtils.isNumeric(firstNumber) || !NumberUtils.isNumeric(secondNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return  (NumberUtils.convertToDouble(firstNumber) + NumberUtils.convertToDouble(secondNumber)) / 2;
    }

    public static Double squareRoot(String number) {
        if (!NumberUtils.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return  Math.sqrt(NumberUtils.convertToDouble(number));
    }
}
