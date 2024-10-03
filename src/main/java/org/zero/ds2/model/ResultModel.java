package org.zero.ds2.model;

import java.util.List;

public record ResultModel(
        Double a,
        Double b,
        Double c,
        List<Result> resultList
) {
}
