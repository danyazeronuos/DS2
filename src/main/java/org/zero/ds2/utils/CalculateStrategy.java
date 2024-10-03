package org.zero.ds2.utils;

import lombok.AllArgsConstructor;
import org.zero.ds2.model.Calculator;
import org.zero.ds2.model.Result;

import java.util.List;

@AllArgsConstructor
public class CalculateStrategy implements Calculator{
    private Calculator calculator;

    @Override
    public List<Result> calculate(Double a, Double b, Double c) {
        return calculator.calculate(a, b, c);
    }
}
