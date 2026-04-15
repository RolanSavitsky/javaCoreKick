package com.hopik.task1.service;

import com.hopik.task1.entity.CustomArrayWrapper;

import java.util.Optional;

public interface AverageService {
    Optional<Double> calculateAverage(CustomArrayWrapper array);
}
