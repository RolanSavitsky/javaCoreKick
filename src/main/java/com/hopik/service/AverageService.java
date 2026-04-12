package com.hopik.service;

import com.hopik.entity.Entity;

import java.util.Optional;

public interface AverageService {
    Optional<Double> calculateAverage(Entity array);
}
