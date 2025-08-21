package Exercises.EncapConsThis.zeroum;

import Exercises.EncapConsThis.zeroum.Entity.Bank;

import java.util.Locale;
import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bank;

        System.out.println("Digite o number Acount: ");
        Integer numberAcount = sc.nextInt();

        System.out.println("Digite o AcountName: ");
        String nameAcount = sc.next();

        System.out.println("Deseja realizar um deposito inicial? (yes or not) ");
        String depositInicial = sc.next();


        if (depositInicial.equalsIgnoreCase("yes")) {
            System.out.println("Insira o valor a depositar: ");
            Double amount = sc.nextDouble();
            System.out.println("Created Acount Sucefull");
            bank = new Bank(numberAcount, nameAcount, amount);
            System.out.println(bank.mostrarInfo());
        } else {
            System.out.println("Created Acount Sucefull");
            bank = new Bank(numberAcount, nameAcount);
        }

        bank.deposit(500.00);
        System.out.println(bank.mostrarInfo());

        sc.close();
    }
}
