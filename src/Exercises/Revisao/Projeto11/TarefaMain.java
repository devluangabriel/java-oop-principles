package Exercises.Revisao.Projeto11;

import Exercises.Revisao.Projeto11.Entity.Tarefa;

import java.time.LocalDate;

public class TarefaMain {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa("Lutar", LocalDate.parse("2025-08-19"));
        Tarefa t2 =  new Tarefa("Lutar", LocalDate.parse("2025-08-19"), 10);
        System.out.println(t1.estaAtrsada());
    }
}
