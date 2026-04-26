package com.hopik.task1.observer.impl;

import com.hopik.task1.entity.ArrayMetrics;
import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.observer.ArrayEvent;
import com.hopik.task1.observer.ArrayObserver;
import com.hopik.task1.service.AverageService;
import com.hopik.task1.service.MinMaxService;
import com.hopik.task1.service.SumService;
import com.hopik.task1.service.impl.AverageServiceImpl;
import com.hopik.task1.service.impl.MinMaxServiceImpl;
import com.hopik.task1.service.impl.SumServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayObserverImpl implements ArrayObserver {
    public static final Logger logger = LogManager.getLogger();

    @Override
    public void updateMetrics(ArrayEvent event) {
        CustomArrayWrapper source = event.getSource();
        logger.info("Observer triggered for array id: {}. Recalculating statistics:", source.getId());

        MinMaxService minMaxService = new MinMaxServiceImpl();
        SumService sumService = new SumServiceImpl();
        AverageService averageService = new AverageServiceImpl();

        int min = minMaxService.calculateMin(source).orElse(0);
        int max = minMaxService.calculateMax(source).orElse(0);
        int sum = sumService.calculateSum(source).orElse(0);
        double average = averageService.calculateAverage(source).orElse(0.0);

        ArrayMetrics arrayMetrics = new ArrayMetrics(min, max, sum, average);
    }
}
