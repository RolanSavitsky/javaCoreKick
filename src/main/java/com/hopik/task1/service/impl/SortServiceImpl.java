package com.hopik.task1.service.impl;

import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.service.SortService;

public class SortServiceImpl implements SortService {
    private void swap(CustomArrayWrapper array, int i, int j) {
        int temp = array.getElement(i);
        array.setElement(i, array.getElement(j));
        array.setElement(j, temp);
    }

    private int partition(CustomArrayWrapper array, int left, int right) {
        int pivot = array.getElement((right + left) / 2);
        int i = left - 1;
        int j = right + 1;

        while (true) {

            do {
                ++i;
            } while (array.getElement(i) < pivot);

            do {
                --j;
            } while (array.getElement(j) < pivot);

            if (i >= j) {
                return j;
            }

            swap(array, i, j);
        }
    }

    @Override
    public void quickSort(CustomArrayWrapper array, int left, int right) {

        if (left < right) {
            int border = partition(array, left, right);
            quickSort(array, left, border);
            quickSort(array, border + 1, right);
        }
    }

    @Override
    public void selectionSort(CustomArrayWrapper array) {

        for (int i = 0; i < array.getSize(); ++i) {
            int min = i;

            for (int j = 0; j < array.getSize(); ++j) {

                if (array.getElement(j) < array.getElement(min)) {
                    min = j;
                }
            }
            swap(array, i, min);
        }
    }
}
