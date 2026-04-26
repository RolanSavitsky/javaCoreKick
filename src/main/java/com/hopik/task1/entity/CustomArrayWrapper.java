package com.hopik.task1.entity;

import com.hopik.task1.exception.ArrayException;
import com.hopik.task1.observer.ArrayEvent;
import com.hopik.task1.observer.ArrayObserver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArrayWrapper {
    private static final Logger logger = LogManager.getLogger();
    private int[] elements;
    private final long id;
    private ArrayObserver observer;

    public CustomArrayWrapper(int[] data, long id) {
        elements = data;
        this.id = id;
        logger.info("Created CustomArrayWrapper with data: {}. Id: {}", Arrays.toString(elements), id);
    }

    public CustomArrayWrapper(int size, long id) {
        this.elements = new int[size];
        this.id = id;
        logger.info("Created CustomArrayWrapper with size: {}, Id: {}", size, id);
    }

    public int[] getElements() {
        logger.debug("getElements called");
        return elements.clone();
    }

    public void setElements(int[] data) {
        logger.debug("Array replaced with: {}", Arrays.toString(data));
        elements = data;
        notifyObserver();
    }

    public int getSize() {
        return elements.length;
    }

    public long getId(){
        return id;
    }

    public int getElement(int index) {
        return this.elements[index];
    }

    public void setElement(int index, Integer value) {
        this.elements[index] = value;
        notifyObserver();
    }

    public void attach(ArrayObserver observer) {
        if (observer != null) {
            this.observer = observer;
            logger.debug("Observer attached to array id: {}", id);
        } else {
            throw new ArrayException("Observer can't be null");
        }
    }

    public void detach() {
        this.observer = null;
        logger.debug("Observer detached from array with id: {}", id);
    }

    private void notifyObserver() {
        if (observer != null) {
            logger.debug("Notifying observers for array id: {}", id);
            ArrayEvent event = new ArrayEvent(this);
            observer.updateMetrics(event);
        }
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        CustomArrayWrapper that = (CustomArrayWrapper) o;

        return Arrays.equals(elements, that.elements);
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}