package com.hopik.task1.service;

import com.hopik.task1.entity.CustomArrayWrapper;

import java.util.Optional;

public interface MinMaxService {
    Optional<Integer> calculateMin(CustomArrayWrapper array);
    Optional<Integer> calculateMax(CustomArrayWrapper array);
}
