package com.hopik.task1.repository.specification.impl;

import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.repository.specification.ArraySpecification;
import com.hopik.task1.service.SumService;
import com.hopik.task1.service.impl.SumServiceImpl;


public class SumLessSpecification implements ArraySpecification {
    private final int thresholdSum;

    public SumLessSpecification(int thresholdSumSum) {
        this.thresholdSum = thresholdSumSum;
    }

    @Override
    public boolean specify(CustomArrayWrapper customArrayWrapper) {
        SumService sumService = new SumServiceImpl();
        int sum = sumService.calculateSum(customArrayWrapper).orElse(0);
        return sum < thresholdSum;
    }
}
