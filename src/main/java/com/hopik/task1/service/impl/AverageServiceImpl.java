package com.hopik.task1.service.impl;

import com.hopik.task1.service.AverageService;
import com.hopik.task1.service.SumService;
import com.hopik.task1.entity.CustomArrayWrapper;

import java.util.Optional;

public class AverageServiceImpl implements AverageService {

    @Override
    public Optional<Double> calculateAverage(CustomArrayWrapper array) {

        if (array == null || array.getSize() == 0) {
            return Optional.empty();
        }

        SumService sumService = new SumServiceImpl();
        Optional<Integer> sum = sumService.calculateSum(array);

        return sum.map(temp -> (double) temp / array.getSize());
    }

}
