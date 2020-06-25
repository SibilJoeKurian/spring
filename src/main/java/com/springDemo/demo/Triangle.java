package com.springDemo.demo;

public class Triangle {
    private
    Point point1;
    Point point2;
    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }


    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public void draw(){
        System.out.println("The points are point1= "+getPoint1().getX()+" "+getPoint1().getY());
        System.out.println("The points are point1= "+getPoint2().getX()+" "+getPoint2().getY());
    }
}
