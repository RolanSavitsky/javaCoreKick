package com.hopik.task1.service;

import com.hopik.task1.entity.CustomArrayWrapper;

public interface SortService {
    void quickSort(CustomArrayWrapper array, int left, int right);
    void selectionSort(CustomArrayWrapper array);
}
