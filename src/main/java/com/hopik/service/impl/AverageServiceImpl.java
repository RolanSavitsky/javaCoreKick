package com.hopik.service.impl;

import com.hopik.service.AverageService;
import com.hopik.service.SumService;
import com.hopik.entity.Entity;

import java.util.Optional;

public class AverageServiceImpl implements AverageService {

    @Override
    public Optional<Double> calculateAverage(Entity array) {

        if (array == null || array.size() == 0) {
            return Optional.empty();
        }

        SumService sumService = new SumServiceImpl();
        Optional<Integer> sum = sumService.calculateSum(array);

        return sum.map(temp -> (double) temp / array.size());
    }

}
