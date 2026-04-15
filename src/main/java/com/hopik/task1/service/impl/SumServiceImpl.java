package com.hopik.task1.service.impl;

import com.hopik.task1.service.SumService;
import com.hopik.task1.entity.CustomArrayWrapper;

import java.util.Optional;

public class SumServiceImpl implements SumService {

    @Override
    public Optional<Integer> calculateSum(CustomArrayWrapper array) {

        if (array == null || array.getSize() == 0) {
            return Optional.empty();
        }

        int sum = array.getElement(0);

        for (int i = 1; i < array.getSize(); ++i) {
            sum += array.getElement(i);
        }

        return Optional.of(sum);
    }
}
