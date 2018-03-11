package ru.stqa.pft.sandbox;

public class Rectangle {

    double a;
    double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }


    // function  which not relte to object
    public static double area(double a, double b){
        return a * b;
    }

    // function method which relate to Square object
    public double area(){
        return this.a * this.b;
    }
}
