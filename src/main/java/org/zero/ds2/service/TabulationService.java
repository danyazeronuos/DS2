package org.zero.ds2.service;

import lombok.AllArgsConstructor;
import org.zero.ds2.model.Result;
import org.zero.ds2.utils.TabulationFunction;

import java.util.List;
import java.util.stream.IntStream;

@AllArgsConstructor
public class TabulationService {
    private Double start;
    private Double finish;
    private Double step;

    public List<Result> calculate() {
        int iterations = (int) Math.round(getIterations() - 1);
        var calculator = new TabulationFunction();
        return IntStream.range(0, iterations)
                .mapToDouble(iteration -> start + step * iteration)
                .mapToObj(calculator::apply)
                .toList();
    }


    private double getIterations() {
        return (finish - start) / step;
    }
}
