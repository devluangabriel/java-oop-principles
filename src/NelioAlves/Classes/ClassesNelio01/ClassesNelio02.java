package NelioAlves.Classes.ClassesNelio01;

import NelioAlves.Classes.ClassesNelio01.Entity.Product;

import java.util.Locale;
import java.util.Scanner;

public class ClassesNelio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product date: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("Enter add product quantity: ");
        product.AddProducts(sc.nextInt());

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);

        System.out.println("Enter REMOVE product quantity: ");
        product.RemoveProducts(sc.nextInt());

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);

        sc.close();
    }
}
