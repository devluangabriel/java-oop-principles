package Exercises.Revisao.Projeto6.Entity;

import java.time.LocalDate;
import java.time.Period;

public class CalculadoraDatas {

    public static Long diferencaEmDias(LocalDate initial, LocalDate end){
        Period periodo = Period.between(initial, end);
        System.out.println("Periodo: " + periodo.getDays());
        return (long) periodo.getDays();
    }

    public static void  diferencaCompleta(LocalDate initial, LocalDate end){
        Period periodo = Period.between(initial, end);
        System.out.println(periodo.getDays());
        System.out.println(periodo.getMonths());
        System.out.println(periodo.getYears());
    }
}
