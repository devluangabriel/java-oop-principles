package Exercises.Estaticos;

import Exercises.Estaticos.Entity.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        System.out.println("Quantos dolares voce ira comprar: ");
        converter.real = sc.nextDouble();

        converter.result();

        //consigo acessar o objeto mesmo não estando instanciado quando o objeto e static
        System.out.println("Acessando membro static DOLAR" + CurrencyConverter.dolar);
        System.out.println("Acessando membro static IOF" + CurrencyConverter.iof);
        sc.close();
    }
}
