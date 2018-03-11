package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("dude");

        Square s = new Square(5);
        System.out.println("Площадь квадрата с стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника с стороной " + r.a + " и " + r.b + " = " + r.area());

//    System.out.println("2 + 2 = " + 2 + 2);
//    System.out.println("2 + 2 = " + (2 + 2));
    }

    private static void hello(String sombody) {
        System.out.println("Hello, " + sombody + "!");
    }
}
