package Exercises.Revisao.Projeto8;

import Exercises.Revisao.Projeto8.Entity.CalendarioMensal;

import java.time.LocalDate;
import java.util.List;

public class CalendarioMensalMain {
    public static void main(String[] args) {
        CalendarioMensal sc = new CalendarioMensal(LocalDate.parse("2025-08-15"));
        System.out.println(sc.listarSegundasFeiras());

    }
}
