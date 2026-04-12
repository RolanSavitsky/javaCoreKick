package com.hopik.service.impl;

import com.hopik.service.MinMaxService;
import com.hopik.entity.Entity;

import java.util.Optional;

public class MinMaxServiceImpl implements MinMaxService {

    @Override
    public Optional<Integer> calculateMin(Entity array) {

        if (array == null || array.size() == 0) {
            return Optional.empty();
        }

        int min = 0;

        for (int i = 1; i < array.size(); ++i) {

            if (array.get(i) < min) {
                min = array.get(i);
            }
        }

        return Optional.of(min);
    }

    @Override
    public Optional<Integer> calculateMax(Entity array) {

        if (array == null || array.size() == 0) {
            return Optional.empty();
        }

        int max = array.get(0);

        for (int i = 1; i < array.size(); ++i) {

            if (array.get(i) > max) {
                max = array.get(i);
            }
        }

        return Optional.of(max);
    }

}
