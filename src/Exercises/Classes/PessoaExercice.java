package Exercises.Classes;

import Exercises.Classes.Entity.Pessoa;

public class PessoaExercice {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();
        joao.name = "Joao";
        joao.age = 19;
        System.out.println(joao.name + " " + joao.age);
        joao.aniversario();
    }
}
