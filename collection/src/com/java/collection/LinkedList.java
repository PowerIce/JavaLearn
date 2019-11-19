package com.java.collection;

import java.util.List;

public class LinkedList /*implements List*/ {
    private Node first;
    private Node last;

    private int size;
    public void add(Object obj){
        Node n = new Node();
        if(first == null){
            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);
            first = n;
            last = n;
        }else {
            n.setPrevious(last);
            n.setObj(obj);
            n.setNext(null);
            last.setNext(n);
            last = n;
        }
        size++;
    }
    public Node node(int index){
        Node temp = null;
        if(first != null){
            temp = first;
            for(int i = 0;i < index;i ++){
                temp = temp.next;
            }
        }
        return temp;
     }

    public void  add(int index,Object obj){
        Node temp = node(index);
        Node mewNode = new Node();
        mewNode.obj = obj;
        if(temp != null){
            Node up = temp.previous;
            up.next = mewNode;
            mewNode.previous = up;
            mewNode.next = temp;
            temp.previous = mewNode;
            size++;
        }
    }
    public int size(){
        return size;
    }
    public Object get(int index){
        Node temp = null;
        if(first != null){
            temp = first;
            for(int i = 0;i < index;i ++){
                temp = temp.next;
            }
        }
        return temp.obj;
    }
    public void remove(int index){
        Node temp = null;
        if(first != null){
            temp = first;
            for (int i = 0;i < index;i ++){
                temp = temp.next;
            }
        }
        if(temp != null){
            Node up = temp.previous;
            Node down = temp.next;
            up.next = down;
            down.previous = up;
            size--;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("aaa");
        list.add("bbb");
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}