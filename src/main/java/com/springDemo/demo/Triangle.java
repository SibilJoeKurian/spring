package com.springDemo.demo;

public class Triangle {

    private
    String type;



    int height;
    public Triangle(String type){
        this.type=type;
    }
    public Triangle (int height){
        this.height=height;
    }
    public Triangle(int height,String type){
        this.height=height;
        this.type=type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getHeight() {
        return height;
    }
    public void draw(){
        System.out.println(getType()+" Drawing triangle "+getHeight());
    }
}
