package com.java.Day2;
class Point{
    double x,y;
    public Point(double _x,double _y){
        x = _x;
        y = _y;
    }
    public double getDistance(Point p){
        System.out.println(x);
        System.out.println(y);
        System.out.println(p.y);
        System.out.println(y);
        return Math.sqrt((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
    }
}
public class TestConstuctor {
    public static void main(String[] args) {
        Point p = new Point(3.0,4.0);
        Point orign = new Point(0.0,0.0);

        System.out.println(p.getDistance(orign));
    }
}
