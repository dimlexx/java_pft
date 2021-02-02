package ru.stqa.pft.sandbox;

public class MFP {
  public static void main(String[] args) {
    hello("world");
    hello("123");
    hello("qwe");

    Square s = new Square();

    s.l = 5;
    System.out.println("Площадь " + s.l + " = " + area(s));

    int l = 15;
    int ss = l * l;
    System.out.println("Площадь квадрата " + l + " = " + ss);

    double q = 2;
    double w = q * q;
    System.out.println("Площадь квадрата " + q + " = " + w);

    Rectangle r = new Rectangle();
    r.a = 4;
    r.b = 6;
    System.out.println("Площадь прямоугольника " + r.a + " и " + r.b + " = " + area(r));

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + " !");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }

}