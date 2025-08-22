package Exercises.Revisao.Projeto7;

import Exercises.Revisao.Projeto7.Entity.Agendamento;

import java.time.LocalDateTime;

public class AgendamentoMain {
    public static void main(String[] args) {
        Agendamento outro = new Agendamento("Retirada de rins", LocalDateTime.parse("2025-08-22T15:22:31"), 90);
        Agendamento tri = new Agendamento("Retirada de figado", LocalDateTime.parse("2025-08-22T15:22:39"), 92);

        System.out.println(tri.ocorreNoMesmoDia(outro));

    }
}
