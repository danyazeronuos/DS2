package org.zero.ds2.service;

import lombok.AllArgsConstructor;
import org.zero.ds2.model.Calculator;
import org.zero.ds2.model.Result;
import org.zero.ds2.utils.FunctionStep;

import java.util.List;
import java.util.stream.IntStream;

@AllArgsConstructor
public class SumService implements Calculator {

    public List<Result> calculate(Double x, Double iterations, Double epsilon) {
        return List.of(
                new Result(leftPart(x), rightPart(x, iterations, epsilon))
        );
    }

    private Double leftPart(Double x) {
        var sum = 1.0 + x;
        var sumInPow = sum * sum * sum;
        return 1.0 / sumInPow;
    }

    private Double rightPart(Double x, Double iterations, Double epsilon) {
        var stepFunction = new FunctionStep();
        return 1.0 + IntStream.range(2, (int) (iterations+1))
                .mapToDouble(iteration -> stepFunction.apply(x, iteration))
                .filter(element -> Math.abs(element) > epsilon)
                .sum();
    }
}
