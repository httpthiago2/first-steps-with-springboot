package br.com.thiago.firststepswithspringboot.calculator;

import br.com.thiago.firststepswithspringboot.exceptions.UnsupportedMathOperationException;
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
        if (!NumberUtils.isNumeric(firstNumber) || !NumberUtils.isNumeric(secondNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return NumberUtils.convertToDouble(firstNumber) + NumberUtils.convertToDouble(secondNumber);
    }

    @RequestMapping(value = "/subtract/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    public Double subtract(
            @PathVariable(value = "firstNumber") String firstNumber,
            @PathVariable(value = "secondNumber") String secondNumber
    ) {
        if (!NumberUtils.isNumeric(firstNumber) || !NumberUtils.isNumeric(secondNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return NumberUtils.convertToDouble(firstNumber) - NumberUtils.convertToDouble(secondNumber);
    }

    @RequestMapping(value = "/multiply/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    public Double multiply(
            @PathVariable(value = "firstNumber") String firstNumber,
            @PathVariable(value = "secondNumber") String secondNumber
    ) {
        if (!NumberUtils.isNumeric(firstNumber) || !NumberUtils.isNumeric(secondNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return NumberUtils.convertToDouble(firstNumber) * NumberUtils.convertToDouble(secondNumber);
    }

    @RequestMapping(value = "/divide/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    public Double divide(
            @PathVariable(value = "firstNumber") String firstNumber,
            @PathVariable(value = "secondNumber") String secondNumber
    ) {
        if (!NumberUtils.isNumeric(firstNumber) || !NumberUtils.isNumeric(secondNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return NumberUtils.convertToDouble(firstNumber) / NumberUtils.convertToDouble(secondNumber);
    }

    @RequestMapping(value = "/mean/{firstNumber}/{secondNumber}", method = RequestMethod.GET)
    public Double mean(
            @PathVariable(value = "firstNumber") String firstNumber,
            @PathVariable(value = "secondNumber") String secondNumber
    ) {
        if (!NumberUtils.isNumeric(firstNumber) || !NumberUtils.isNumeric(secondNumber)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return  (NumberUtils.convertToDouble(firstNumber) + NumberUtils.convertToDouble(secondNumber)) / 2;
    }

    @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
    public Double squareRoot(
            @PathVariable(value = "number") String number
    ) {
        if (!NumberUtils.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return  Math.sqrt(NumberUtils.convertToDouble(number));
    }
}
