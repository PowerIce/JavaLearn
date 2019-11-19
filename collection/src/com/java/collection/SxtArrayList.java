package com.java.collection;

public class SxtArrayList {
    private Object[] elementData;
    private int size;


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (elementData == null) {
            return false;
        }
        return true;
    }

    public SxtArrayList() {
        this(10);
    }

    public SxtArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        elementData = new Object[initialCapacity];
    }

    public void add(Object obj) {
        //数组扩容与数据copy

        if (size >= elementData.length) {
            Object[] newArray = new Object[size * 2 + 1];
            System.arraycopy(elementData, 0, newArray, 0, elementData.length);
            elementData = newArray;
        }

        elementData[size] = obj;
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return elementData[index];
    }

    public void remove(int index) {
        rangeCheck(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }
        elementData[--size] = null;
//         return old;
    }

    public void remove(Object obj){
        for(int i = 0;i < size;i ++){
            if (get(i).equals(obj)){
                remove(i);
            }
        }
    }

    public void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SxtArrayList list = new SxtArrayList(3);
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("ggg");
        System.out.println(list.size());
        System.out.println(list.get(6));
    }
}
