package Exercises.Revisao.Projeto6;


import Exercises.Revisao.Projeto6.Entity.CalculadoraDatas;

import java.time.LocalDate;

public class CalculadoraDatasMain {
    public static void main(String[] args) {
        CalculadoraDatas.diferencaCompleta(LocalDate.parse("2025-02-21"), LocalDate.parse("2025-08-21"));
        System.out.println(CalculadoraDatas.diferencaEmDias(LocalDate.parse("2025-08-20"), LocalDate.parse("2025-08-21")));
    }
}
