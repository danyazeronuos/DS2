package org.zero.ds2;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionStep implements BiFunction<Double, Integer,Double> {
    @Override
    public Double apply(Double xValue, Integer iteration) {
        double result = getFraction(Double.valueOf(iteration)) * Math.pow(xValue, iteration - 1);
        if (iteration % 2 == 0) return -1.0 * result;
        return result;
    }

    private static double getFraction(Double iteration) {
        return (iteration * (iteration + 1.0)) / 2.0;
    }
}
