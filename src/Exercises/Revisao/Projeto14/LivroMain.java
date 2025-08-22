package Exercises.Revisao.Projeto14;

import Exercises.Revisao.Projeto14.Entity.Emprestimo;
import Exercises.Revisao.Projeto14.Entity.Livro;

import java.time.LocalDate;

public class LivroMain {
    public static void main(String[] args) {
        Livro livro = new Livro("Habitos de um dev", "Fernando bol");
        Emprestimo emprestimo = new Emprestimo(livro, LocalDate.parse("2026-04-20"));
        System.out.println(emprestimo.estaAtrsado());

    }
}
