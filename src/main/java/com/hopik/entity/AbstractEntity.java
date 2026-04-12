package com.hopik.entity;

public abstract class AbstractEntity<T> {
    private T[] array;

    public abstract int size();
}