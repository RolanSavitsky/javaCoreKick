package com.hopik.task1.comporator;

import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.service.AverageService;
import com.hopik.task1.service.impl.AverageServiceImpl;

import java.util.Comparator;

public class ArrayAverageComporator implements Comparator<CustomArrayWrapper> {

    @Override
    public int compare(CustomArrayWrapper firstArray, CustomArrayWrapper secondArray){
        AverageService averageService = new AverageServiceImpl();

        double firstAverage = averageService.calculateAverage(firstArray).orElse(0.0);
        double secondAverage = averageService.calculateAverage(secondArray).orElse(0.0);

        return Double.compare(firstAverage,secondAverage);
    }
}
