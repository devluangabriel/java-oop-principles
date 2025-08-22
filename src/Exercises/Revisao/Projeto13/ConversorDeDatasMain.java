package Exercises.Revisao.Projeto13;

import Exercises.Revisao.Projeto13.Entity.ConversorDeDatas;

import java.time.LocalDate;

public class ConversorDeDatasMain {
    public static void main(String[] args) {
        System.out.println(ConversorDeDatas.paraFormatoBR(LocalDate.now()));

        System.out.println(ConversorDeDatas.paraFormatoISO(LocalDate.now()));

        System.out.println(ConversorDeDatas.stringParaLocalDateTime("2025-08-19T21:36:39", "dd/MM/yyyy HH:mm"));
    }
}
