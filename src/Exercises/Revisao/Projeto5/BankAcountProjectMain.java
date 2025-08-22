package Exercises.Revisao.Projeto5;

import Exercises.Revisao.Projeto5.Entity.BankAcountProject;

import java.time.LocalDateTime;

public class BankAcountProjectMain {
    public static void main(String[] args) {
        BankAcountProject sc = new BankAcountProject("Cleiton", 20.40, LocalDateTime.parse("2025-08-20T22:34:36"));

        sc.depositar(200);
        sc.sacar(300);
        sc.diasDesdeaCriacao();


    }
}
