package com.hopik.service;

import com.hopik.entity.Entity;

public interface SortService {
    void quickSort(Entity array, int left, int right);
    void selectionSort(Entity array);
}
