package NelioAlves.Construtores.ConstructorAndPalavraThisAndEncapsulamento.Aula01;

import NelioAlves.Classes.ClassesNelio01.Entity.Product;
import NelioAlves.Construtores.ConstructorAndPalavraThisAndEncapsulamento.Aula01.Entity.ZeroUm;

import java.util.Locale;
import java.util.Scanner;

public class zeroum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        Double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        Integer quantityA = sc.nextInt();

        ZeroUm zeroUm = new ZeroUm(name, price, quantityA);

        System.out.println();
        System.out.println("Product data: " );
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        zeroUm.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " );
        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        zeroUm.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " );
        sc.close();
    }
}
