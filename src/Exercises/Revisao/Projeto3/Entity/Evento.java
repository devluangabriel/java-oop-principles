package Exercises.Revisao.Projeto3.Entity;

import Exercises.Revisao.Projeto3.EventoMain;

import java.time.LocalDateTime;

public class Evento {
    public static void main(String[] args) {
        EventoMain sc = new EventoMain("Baile do arocha", LocalDateTime.parse("2025-10-18T19:36:59"));
        System.out.println(sc.ehFuturo());
        System.out.println(sc.formatarData());
    }
}
