package Exercises.Classes;

import Exercises.Classes.Entity.BankAcount;

public class BankMain {
    public static void main(String[] args) {
        BankAcount bankAcount = new BankAcount();

        bankAcount.exibirSaldo();
        bankAcount.sacarMoney(20.00);
        bankAcount.deposite(50.00);
        bankAcount.sacarMoney(20.00);
        bankAcount.exibirSaldo();
    }
}
