package com.java.MyCollection;

public class MyArrayList {
    Object[] value;

    int size;

    public MyArrayList() {
//        value = new Object[16];
        this(16);
    }

    public MyArrayList(int size) {
        value = new Object[size];
    }
    public void add(Object obj){
        value[size] = obj;
        size++;
        if(size >= value.length){
            //符合条件之后说明需要扩容
            int newCapacity = value.length*2;
            Object[] newList = new Object[newCapacity];
            //System.arraycopy();//copy数组此方法可用
            for(int i = 0;i<value.length;i++){
                newList[i] = value[i];
            }
            value = newList;
        }
    }

    public Object getAdd(int index){
        if(index < 0 || index > size - 1){
            try{
                throw new Exception();//手动抛出异常
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return value[index];

    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(2);
        list.add("add");

        list.add(new Human("小何"));
        list.add("newHuman");
        System.out.println(list.getAdd(0));


    }
}
