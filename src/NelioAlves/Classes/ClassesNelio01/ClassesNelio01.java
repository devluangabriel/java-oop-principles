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

        double areaY = y.CalculoArea(y.a, y.b, y.c);
        double areaX = x.CalculoArea(x.a, x.b, x.c);

        System.out.println("Y : " + areaY);
        System.out.println("X : " + areaX);

        if (areaX > areaY) {
            System.out.println("AREA X E O MAIOR");
        } else if (areaX < areaY) {
            System.out.println("AREA Y E O MAIOR!!");
        }

        sc.close();
    }
}
