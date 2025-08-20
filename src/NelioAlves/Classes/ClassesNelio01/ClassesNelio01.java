package NelioAlves.Classes.ClassesNelio01;

import NelioAlves.Classes.ClassesNelio01.Entity.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ClassesNelio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Digite o primeiro valor: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
        double q = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(q * (q - y.a) * (q - y.b) * (q - y.c));

        System.out.println(areaX);
        System.out.println(areaY);

        if (areaX > areaY) {
            System.out.println("Ara X E MAIOR");
        } else if (areaX < areaY) {
            System.out.println("Ara y e o maior");
        }


        sc.close();
    }
}
