package com.hopik.task1.warehouse.impl;

import com.hopik.task1.entity.ArrayMetrics;
import com.hopik.task1.warehouse.ArrayWarehouse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class ArrayWarehouseImpl implements ArrayWarehouse {
    private static final Logger logger = LogManager.getLogger();
    private static ArrayWarehouse instance;
    private final Map<Long, ArrayMetrics> map = new HashMap<>();

    private ArrayWarehouseImpl() {
    }

    public static ArrayWarehouse getInstance() {
        if (instance == null) {
            instance = new ArrayWarehouseImpl();
        }
        return instance;
    }

    @Override
    public void put(long id, ArrayMetrics arrayMetrics) {
        map.put(id, arrayMetrics);
        logger.info("Statistics saved/updated in Warehouse for array id: {}", id);
    }
}
