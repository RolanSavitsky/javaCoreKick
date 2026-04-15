package com.hopik.task1.service;

import com.hopik.task1.entity.CustomArrayWrapper;
import com.hopik.task1.service.impl.AverageServiceImpl;
import com.hopik.task1.service.impl.MinMaxServiceImpl;
import com.hopik.task1.service.impl.SortServiceImpl;
import com.hopik.task1.service.impl.SumServiceImpl;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayServiceTest {
    private static final int[] inputData = {78, 2, 22, 80, 132};
    private static final int[] expectedSorted = {2, 22, 78, 80, 132};
    private static final int EXPECTED_SUM = 314;
    private static final int EXPECTED_MAX = 132;
    private static final double EXPECTED_AVERAGE = 62.8;

    private final SumService sumService = new SumServiceImpl();
    private final MinMaxService minMaxService = new MinMaxServiceImpl();
    private final AverageService averageService = new AverageServiceImpl();
    private final SortService sortService = new SortServiceImpl();

    @Test
    void shouldPositiveSum(){
        CustomArrayWrapper customArrayWrapper = new CustomArrayWrapper(inputData);

        Optional<Integer> sum = sumService.calculateSum(customArrayWrapper);

        assertAll(
                () -> assertTrue(sum.isPresent()),
                () -> assertEquals(EXPECTED_SUM, sum.orElseThrow())
        );
    }

    @Test
    void shouldPositiveMax(){
        CustomArrayWrapper customArrayWrapper = new CustomArrayWrapper(inputData);

        Optional<Integer> max = minMaxService.calculateMax(customArrayWrapper);

        assertAll(
                () -> assertTrue(max.isPresent()),
                () -> assertEquals(EXPECTED_MAX, max.orElseThrow())
        );
    }

    @Test
    void shouldPositiveAverage(){
        CustomArrayWrapper customArrayWrapper = new CustomArrayWrapper(inputData);

        Optional<Double> average = averageService.calculateAverage(customArrayWrapper);

        assertAll(
                () -> assertTrue(average.isPresent()),
                () -> assertEquals(EXPECTED_AVERAGE, average.orElseThrow())
        );
    }

    @Test
    void shouldPositiveSort(){
        CustomArrayWrapper customArrayWrapper = new CustomArrayWrapper(inputData);

        sortService.selectionSort(customArrayWrapper);

        assertArrayEquals(expectedSorted, customArrayWrapper.getElements());
    }
}
