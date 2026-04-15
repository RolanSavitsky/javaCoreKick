package com.hopik.task1.service.impl;

import com.hopik.task1.service.MinMaxService;
import com.hopik.task1.entity.CustomArrayWrapper;

import java.util.Optional;

public class MinMaxServiceImpl implements MinMaxService {

    @Override
    public Optional<Integer> calculateMin(CustomArrayWrapper array) {

        if (array == null || array.getSize() == 0) {
            return Optional.empty();
        }

        int min = 0;

        for (int i = 1; i < array.getSize(); ++i) {

            if (array.getElement(i) < min) {
                min = array.getElement(i);
            }
        }

        return Optional.of(min);
    }

    @Override
    public Optional<Integer> calculateMax(CustomArrayWrapper array) {

        if (array == null || array.getSize() == 0) {
            return Optional.empty();
        }

        int max = array.getElement(0);

        for (int i = 1; i < array.getSize(); ++i) {

            if (array.getElement(i) > max) {
                max = array.getElement(i);
            }
        }

        return Optional.of(max);
    }

}
