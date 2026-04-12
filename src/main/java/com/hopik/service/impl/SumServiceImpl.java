package com.hopik.service.impl;

import com.hopik.service.SumService;
import com.hopik.entity.Entity;

import java.util.Optional;

public class SumServiceImpl implements SumService {

    @Override
    public Optional<Integer> calculateSum(Entity array) {

        if (array == null || array.size() == 0) {
            return Optional.empty();
        }

        int sum = array.get(0);

        for (int i = 1; i < array.size(); ++i) {
            sum += array.get(i);
        }

        return Optional.of(sum);
    }
}
