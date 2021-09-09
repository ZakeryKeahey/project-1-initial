package com.csc205.project1;

import java.util.*;
import java.lang.Math;

public class Point { //class declaration

    double x;
    double y;

    Point() { //constructor
        x = 0.0;
        y = 0.0;
    }

    public Point (double x, double y) {
        this.setPoint(x,y);
    }

    public double getX() { //returns x coordinate of point
        return x;
    }

    public double getY() { //returns y coordinate of point
        return y;
    }

    public void setX(double x) { //sets x coordinate
        this.x = x;
    }

    public void setY(double y) { //sets y coordinate
        this.y = y;
    }

    public void setPoint(double x, double y) { //sets both x & y coordinates
        this.setX(x);
        this.setY(y);
    }

    public void shiftX(double n) {
        this.setX(this.getX()+n);
    }

    public void shiftY(double n) {
        this.setY(this.getY()+n);
    }

    public double distance(Point p) {
        double x1 = p.x;
        double y1 = p.y;
        double d = Math.sqrt(Math.pow(p.getY()-this.getY(),2) + Math.pow(p.getX()-this.getX(),2));
        return d;
    }

    public void rotate(double angle) {
        this.setX(this.getX() * Math.cos(angle) - this.getY() * Math.sin(angle));
        this.setY(this.getX() * Math.sin(angle) + this.getY() * Math.cos(angle));
    }

    public String toString() {
        String coordinatesString = new String();
        coordinatesString = "Point{x = " + String.valueOf(this.getX()) + ", y = " + String.valueOf(this.getY()) + "}";
        return coordinatesString;
    }


}


