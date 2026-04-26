package com.hopik.task1.repository.specification.impl;

import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.repository.specification.ArraySpecification;
import com.hopik.task1.service.AverageService;
import com.hopik.task1.service.impl.AverageServiceImpl;

public class AverageEqualsSpecification implements ArraySpecification {
    private final double targetAverage;

    public AverageEqualsSpecification(double targetAverage){
        this.targetAverage = targetAverage;
    }

    @Override
    public boolean specify(CustomArrayWrapper customArrayWrapper){
        AverageService averageService = new AverageServiceImpl();
        double average = averageService.calculateAverage(customArrayWrapper).orElse(0.0);

        return average == targetAverage;
    }
}
