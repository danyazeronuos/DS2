package org.zero.ds2.service;

import lombok.AllArgsConstructor;
import org.zero.ds2.model.Result;
import org.zero.ds2.utils.FunctionStep;

import java.util.stream.IntStream;

@AllArgsConstructor
public class SumService {
    private Double x;
    private Integer iterations;
    private Double epsilon;

    private Double leftPart() {
        var sum = 1.0 + x;
        var sumInPow = sum * sum * sum;
        return 1.0 / sumInPow;
    }

    private Double rightPart() {
        var stepFunction = new FunctionStep();
        return 1.0 + IntStream.range(2, iterations+1)
                .mapToDouble(iteration -> stepFunction.apply(x, iteration))
                .filter(element -> Math.abs(element) > epsilon)
                .sum();
    }

    public Result calculate() {
        return new Result(leftPart(), rightPart());
    }
}
