package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("dude");

    double l = 5;
    System.out.println("Площадь квадрата с стороной " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника с стороной " + a + " и " + b + " = "+ area(a,b));

//    System.out.println("2 + 2 = " + 2 + 2);
//    System.out.println("2 + 2 = " + (2 + 2));
  }

  public static double area(double len){
    return len * len;
  }

  public static double area(double a, double b){
    return a * b;
  }

  private static void hello(String sombody) {
    System.out.println("Hello, " + sombody + "!");
  }
}
