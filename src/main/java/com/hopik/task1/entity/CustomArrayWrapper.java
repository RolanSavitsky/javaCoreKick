package com.hopik.task1.entity;

import java.util.Arrays;

public class CustomArrayWrapper {
    private int[] elements;

    public CustomArrayWrapper(int[] data) {
        elements = data;
    }

    public CustomArrayWrapper(int size) {
        this.elements = new int[size];
    }

    public int[] getElements(){
        return elements.clone();
    }

    public void setElements(int[] data){
        elements = data;
    }

    public int getSize() {
        return elements.length;
    }

    public Integer getElement(int index) {
        return this.elements[index];
    }

    public void setElement(int index, Integer value) {
        this.elements[index] = value;
    }

    @Override
    public int hashCode(){
        return Arrays.hashCode(elements);
    }

    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        CustomArrayWrapper that = (CustomArrayWrapper) o;
        return Arrays.equals(elements, that.elements);
    }

    @Override
    public String toString(){
        return Arrays.toString(elements);
    }
}
