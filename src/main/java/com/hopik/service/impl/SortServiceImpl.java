package com.hopik.service.impl;

import com.hopik.entity.Entity;
import com.hopik.service.SortService;

public class SortServiceImpl implements SortService {
    private void swap(Entity array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

    private int partition(Entity array, int left, int right) {
        int pivot = array.get((right + left) / 2);
        int i = left - 1;
        int j = right + 1;

        while (true) {

            do {
                ++i;
            } while (array.get(i) < pivot);

            do {
                --j;
            } while (array.get(j) < pivot);

            if (i >= j) {
                return j;
            }

            swap(array, i, j);
        }
    }

    @Override
    public void quickSort(Entity array, int left, int right) {

        if (left < right) {
            int border = partition(array, left, right);
            quickSort(array, left, border);
            quickSort(array, border + 1, right);
        }
    }

    @Override
    public void selectionSort(Entity array) {

        for (int i = 0; i < array.size(); ++i) {
            int min = i;

            for (int j = 0; j < array.size(); ++j) {

                if (array.get(j) < array.get(min)) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }
}
