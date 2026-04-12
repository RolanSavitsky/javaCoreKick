package com.hopik.service;

import com.hopik.entity.Entity;

import java.util.Optional;

public interface MinMaxService {
    Optional<Integer> calculateMin(Entity array);
    Optional<Integer> calculateMax(Entity array);
}
