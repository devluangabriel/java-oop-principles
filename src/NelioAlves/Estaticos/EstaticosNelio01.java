package NelioAlves.Estaticos;

import NelioAlves.Estaticos.Entity.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class EstaticosNelio01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter radiu: ");
        calculator.radiuns = sc.nextDouble();

        double c = calculator.circumFerence(calculator.radiuns);
        double d = calculator.volume(calculator.radiuns);

        System.out.printf("CirumFerence: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", d);
        System.out.printf("PI VALUE: %.2f%n", calculator.PI);

        sc.close();
    }
}
