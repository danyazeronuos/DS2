package org.zero.ds2.utils;

import org.zero.ds2.model.Result;

import java.util.function.Function;

public class TabulationFunction implements Function<Double, Result> {
    @Override
    public Result apply(Double x) {
        return new Result(x, getFunctionResult(x));
    }
    private static double getFunctionResult(Double x) {
        return Math.log(x - 0.5) / Math.sqrt(x);
    }
}
