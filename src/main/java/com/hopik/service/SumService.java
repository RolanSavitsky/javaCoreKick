package com.hopik.service;

import com.hopik.entity.Entity;

import java.util.Optional;

public interface SumService {
    Optional<Integer> calculateSum(Entity array);
}
