package Exercises.Revisao.Projeto4;

import Exercises.Revisao.Projeto4.Entity.ProdutoProjeto;

import java.time.LocalDate;

public class ProdutoMain {
    public static void main(String[] args) {
        ProdutoProjeto sc = new ProdutoProjeto("TV", 20.00, LocalDate.parse("2025-08-27"));
        System.out.println(sc.estaVencido());
        sc.aplicarDescounto(50);
        System.out.println(sc.getPrice());
    }
}
