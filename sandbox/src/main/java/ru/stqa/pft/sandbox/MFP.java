package ru.stqa.pft.sandbox;

public class MFP {
  public static void main(String[] args) {
    hello("world");
    hello("123");
    hello("qwe");

    double len = 5;
    System.out.println("Площадь " + len + " = " + area(len));

    int l = 15;
    int s = l * l;
    System.out.println("Площадь квадрата " + l + " = " + s);
    double q = 2;
    double w = q * q;
    System.out.println("Площадь квадрата " + q + " = " + w);

double a=4;
double b = 6;
System.out.println("Площадь прямоугольника " + a + " и " + b + " = " + area(a, b));
  }

    public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + " !");
  }

  public static double area (double qq){
    return qq * qq;
  }

  public static double area (double a, double b) {
  return a * b;
  }

}