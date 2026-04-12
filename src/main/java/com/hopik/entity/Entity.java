package com.hopik.entity;

public class Entity extends AbstractEntity<Integer>{
    private int[] array;

    public Entity(int size) {
        this.array = new int[size];
    }

    public Entity(int[] array) {
        this.array = array.clone();
    }

    @Override
    public int size() {
        return array.length;
    }

    public Integer get(int index) {
        return array[index];
    }

    public void set(int index, Integer value) {
        array[index] = value;
    }
}
