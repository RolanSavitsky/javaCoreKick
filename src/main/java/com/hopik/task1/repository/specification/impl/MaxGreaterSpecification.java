package com.hopik.task1.repository.specification.impl;

import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.repository.specification.ArraySpecification;
import com.hopik.task1.service.MinMaxService;
import com.hopik.task1.service.impl.MinMaxServiceImpl;

import java.util.Currency;

public class MaxGreaterSpecification implements ArraySpecification {
    private final int thresholdMax;

    public MaxGreaterSpecification(int thresholdMax){
        this.thresholdMax = thresholdMax;
    }

    @Override
    public boolean specify(CustomArrayWrapper customArrayWrapper){
        MinMaxService minMaxService = new MinMaxServiceImpl();
        int max = minMaxService.calculateMax(customArrayWrapper).orElse(0);

        return max > thresholdMax;
    }
}
