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
}
