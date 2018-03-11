package ru.stqa.pft.sandbox;

public class Square {

    double l;

    public Square(double l) {
        this.l = l;
    }


    // function  which not relte to object
    public static double area(double len) {
        return len * len;
    }

    // function method which relate to Square object
    public double area() {
        return this.l * this.l;
    }
}
