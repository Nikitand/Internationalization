package com.example.demo.task2;


import com.example.demo.task2.event.CustomEvent;

import java.util.Arrays;

public class List {

    private Object[] objectsArray;
    private int size = 0;
    private int length = 10;

    public List()
    {
        objectsArray = new Object[length];
    }

    public List(int length)
    {
        this.length = length;
        objectsArray = new Object[length];
    }

    public void setElement(Object obj)
    {
        if (this.size == this.length) {
            changeListSize();
        }
        this.objectsArray[size] = obj;
        size++;
    }

    public void getAllElement()
    {
        int i = 0;
        while(size != i)
        {
            System.out.println(getElement(i));
            i++;
        }
    }

    public int size()
    {
        return size;
    }

    public Object getElement(int index)
    {
        if(index < 0 || index > size )
        {
            return index + " is invalid index";
        }
        return objectsArray[index];
    }

    private void changeListSize()
    {
        this.length += length * 1.5;
        this.objectsArray = Arrays.copyOf(this.objectsArray, this.length);
        CustomEvent.changed();
    }
}
