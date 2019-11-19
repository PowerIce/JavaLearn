package com.java.eleven;

public class TestOuter {
    public static void main(String[] args) {
//        Nose n = new Node();
        Face f = new Face();
        Face.Nose n = f.new Nose();
        n.breath();
        Face.Ear e = new Face.Ear();//静态内部类的实例方法
        e.listen();
    }
}

class Face{
    int type;
    String shape = "鹅蛋脸";
    static String faceColor = "红润";
    class Nose{
        String type;
        void breath(){
            System.out.println(shape);
            System.out.println(faceColor);
            System.out.println(Face.this.type);
            System.out.println("呼吸");
        }
    }
    static class Ear{
        void listen(){
//            System.out.println(shape);//静态内部类无法调用非静态属性
            System.out.println(faceColor);//静态内部类可以调用静态属性
            System.out.println("我在听");
        }
    }
}