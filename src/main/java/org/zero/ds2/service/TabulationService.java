package org.zero.ds2.service;

import lombok.AllArgsConstructor;
import org.zero.ds2.model.Calculator;
import org.zero.ds2.model.Result;
import org.zero.ds2.utils.TabulationFunction;

import java.util.List;
import java.util.stream.IntStream;

@AllArgsConstructor
public class TabulationService implements Calculator {
    public List<Result> calculate(Double start, Double finish, Double step) {
        int iterations = (int) Math.round(((finish - start) / step) - 1);
        var calculator = new TabulationFunction();
        return IntStream.range(0, iterations)
                .mapToDouble(iteration -> start + step * iteration)
                .mapToObj(calculator::apply)
                .toList();
    }
}
