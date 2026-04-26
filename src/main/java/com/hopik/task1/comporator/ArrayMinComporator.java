package com.hopik.task1.comporator;

import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.service.MinMaxService;
import com.hopik.task1.service.impl.MinMaxServiceImpl;

import java.util.Comparator;

public class ArrayMinComporator implements Comparator<CustomArrayWrapper> {

    @Override
    public int compare(CustomArrayWrapper firstArray, CustomArrayWrapper secondArray){
        MinMaxService minMaxService = new MinMaxServiceImpl();

        int firstMin = minMaxService.calculateMin(firstArray).orElse(0);
        int secondMin = minMaxService.calculateMin(secondArray).orElse(0);

        return Integer.compare(firstMin,secondMin);
    }
}
